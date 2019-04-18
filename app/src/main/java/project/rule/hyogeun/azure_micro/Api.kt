package project.rule.hyogeun.azure_micro


import retrofit2.Call
import retrofit2.http.*

/**
    서버 주소 형식을
    www.서버주소.com/user.signin
    www.서버주소.com/user.signup
    형식으로 하려무나
 */

interface API {
    @POST("/user/signin")
    @FormUrlEncoded
    fun logIn(@Field("id") id : String, @Field("pw") pw : String) :  Call<Void>

    @POST("/user/signup")
    @FormUrlEncoded
    fun logUp(@Field("name") name : String, @Field("id") id : String, @Field("pw") pw : String) :  Call<Void>

}