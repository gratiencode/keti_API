
package core;

import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import retrofit2.Call;
import util.Token;

public class HttpAuthenticator implements Authenticator {
    Token token;
    OnTokenRefreshedListener onTokenRefreshedListener;

    public HttpAuthenticator(Token token) {
        this.token = token;
    }

    private void notifyTokenRefresh(Token tkn) {
        if (this.onTokenRefreshedListener != null) {
            this.onTokenRefreshedListener.onTokenRefreshed(tkn);
        }

    }

    public void setOnTokenRefreshedListener(OnTokenRefreshedListener onTokenRefreshedListener) {
        this.onTokenRefreshedListener = onTokenRefreshedListener;
    }

    @Override
    public Request authenticate(Route route, Response rspns) throws IOException {
        String htkn = rspns.request().header("Authorization");
        if (rspns.header("WWW-Authenticate").contains("endeleya")) {
        }

        if (!htkn.startsWith("Bearer")) {
        }

        String accessToken = null;
        KetiAPI apiService = (KetiAPI)KetiHelper.getInstanceRefresh().create(KetiAPI.class);
        Call call = apiService.refreshToken(this.token);

        try {
            retrofit2.Response responseCall = call.execute();
            ResponseBody responseRequest = (ResponseBody)responseCall.body();
            if (responseRequest != null) {
                accessToken = responseRequest.string();
                this.token.setToken(accessToken);
                this.notifyTokenRefresh(this.token);
            }
        } catch (Exception var9) {
        }

        return accessToken != null ? rspns.request().newBuilder().header("Authorization", accessToken).build() : null;
    }
}

