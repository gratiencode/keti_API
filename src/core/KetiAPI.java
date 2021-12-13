/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.List;
import model.Contacts;
import model.Credentials;
import model.Marchandise;
import model.Succursale;
import model.Tiers;
import model.User;
import model.Vehicule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import util.LoginResult;
import util.Token;

/**
 *
 * @author eroot
 */
public interface KetiAPI {
    @GET("user/{uid}")
    Call<ResponseBody> showUser(@Path("uid") String var1);
    
    @POST("auth/refresh/token")
    Call<ResponseBody> refreshToken(@Body Token var1);
    
    @POST("user/save/point")
    Call<User> createUser(@Body User user);
    
    @PATCH("user/{uid}/update")
    Call<User> updateUser(@Path("uid") String uid,@Body User u);
    
    @POST("auth/signin")
    Call<LoginResult> login(@Body Credentials cred);
    
    @POST("sucursal/save/point")
    Call<Succursale> createSuccursale(@Body Succursale suc);
    
    @PATCH("sucursal/{uid}/update")
    Call<Succursale> updateSuccursale(@Path("uid") String uid,@Body Succursale s);
    
    @DELETE("sucursal/{uid}/delete")
    Call<Succursale> deleteSuccursale(@Path("uid") String uid);
    
    @GET("sucursal/list")
    Call<List<Succursale>> getSucursales();

    /**
     *la fonction ici aide a synchroniser avec le serveur les sucursale enregistres hors ligne
     * @param ls la liste de sucursale non synchronise
     * @return la liste synchronise
     */
    @POST("sucursal/sync")
    Call<List<Succursale>> syncSucursal(@Body List<Succursale> ls);
    
    @PATCH("sucursal/group/delete")
    Call<List<Succursale>> removeSucursals(@Body List<Succursale> ls);
    //vehicule
    @POST("vehicules/save/point")
    Call<Vehicule> createVehicule(@Body Vehicule vehicle);
    @PATCH("vehicules/{uid}/update")
    Call<Vehicule> updateVehicule(@Path("uid") String uid,@Body Vehicule vehicle);
    @DELETE("vehicules/{uid}/delete")
    Call<Vehicule> deleteVehicule(@Path("uid") String uid);
    @GET("vehicules/list")
    Call<List<Vehicule>> getVehicules();
    @PATCH("vehicules/sync")
    Call<List<Vehicule>> syncVehicule(@Body List<Vehicule> listV);
    //end vehicule
    //client
    @POST("tiers/save/point")
    Call<Tiers> createTier(@Body Tiers t);
    @PATCH("tiers/{uid}/update")
    Call<Tiers> updateTier(@Path("uid") String uid,@Body Tiers t);
    @DELETE("tiers/{uid}/delete")
    Call<Tiers> deleteTier(@Path("uid") String uid);
    @GET("tiers/list")
    Call<List<Tiers>> getTiers();
    @GET("tiers/list/{type}")
    Call<List<Tiers>> getTiers(@Path("type") String type);
    @PATCH("tiers/sync")
    Call<List<Tiers>> syncTiers(@Body List<Tiers> tiers);
    //end client
    //Marchandise
    @POST("goods/save/point")
    Call<Marchandise> createGoods(@Body Marchandise t);
    @PATCH("goods/{uid}/update")
    Call<Marchandise> updateGoods(@Path("uid") String uid,@Body Marchandise t);
    @DELETE("goods/{uid}/delete")
    Call<Void> deleteGoods(@Path("uid") String uid);
    @GET("goods/list")
    Call<List<Marchandise>> getMarchandises();
    @GET("goods/list/{name}")
    Call<List<Marchandise>> getGoodsLike(@Path("name") String name);
    @PATCH("goods/sync")
    Call<List<Marchandise>> syncGoods(@Body List<Marchandise> tiers);
    //end m
    //contact
    @PATCH("contacts/alter")
    Call<List<Contacts>> updateContacts(@Body List<Contacts> contac);
    
   
    
    
}
