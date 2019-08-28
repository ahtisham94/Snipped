package com.aksa.prepaid.newcortex.retrofit.interfaces

import com.aksa.prepaid.newcortex.model.ForgetPassword.ForgetPasswordRequest
import com.aksa.prepaid.newcortex.model.ForgetPassword.ForgetPasswordResponse
import com.aksa.prepaid.newcortex.model.Levels.GetLevelRequest
import com.aksa.prepaid.newcortex.model.Levels.GetLevelResponse
import com.aksa.prepaid.newcortex.model.ResetPassword.ResetPasswordRequest
import com.aksa.prepaid.newcortex.model.ResetPassword.ResetPasswordResponce
import com.aksa.prepaid.newcortex.model.demographic_info.DemographicInfoRequest
import com.aksa.prepaid.newcortex.model.demographic_info.DemographicInfoResponse
import com.aksa.prepaid.newcortex.model.instrumentation.InstrumentRequest
import com.aksa.prepaid.newcortex.model.instrumentation.InstrumentResponse
import com.aksa.prepaid.newcortex.model.manufacturers.ManufacturersResponse
import com.aksa.prepaid.newcortex.model.patient_info.GetPatientProfileRequest
import com.aksa.prepaid.newcortex.model.patient_info.GetPatientProfileResponse
import com.aksa.prepaid.newcortex.model.patient_info.PatientInfoRequest
import com.aksa.prepaid.newcortex.model.patient_info.PatientInfoResponse
import com.aksa.prepaid.newcortex.model.patient_treatment.PatientTreatmentMainResponse
import com.aksa.prepaid.newcortex.model.patient_treatment.PatientTreatmentSubRequest
import com.aksa.prepaid.newcortex.model.patient_treatment.PatientTreatmentSubResponse
import com.aksa.prepaid.newcortex.model.physician.PhysicianDepResponse
import com.aksa.prepaid.newcortex.model.physician.PhysicianNameRequest
import com.aksa.prepaid.newcortex.model.physician.PhysicianNameResponse
import com.aksa.prepaid.newcortex.model.procedure.ProcedureRequest
import com.aksa.prepaid.newcortex.model.procedure.ProcedureResponse
import com.aksa.prepaid.newcortex.model.questionnaire.PatientQuestionnaireRequest
import com.aksa.prepaid.newcortex.model.questionnaire.PatientQuestionnaireResponse
import com.aksa.prepaid.newcortex.model.signin.SigninRequest
import com.aksa.prepaid.newcortex.model.signin.SigninResponse
import com.aksa.prepaid.newcortex.model.signup.SignupRequest
import com.aksa.prepaid.newcortex.model.signup.SignupResponse

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface APIIntrface {
    @POST("InsertDemographicInformation")
    fun insertDemographicInfo(
            @Body insertDemographicInfo: DemographicInfoRequest): Call<DemographicInfoResponse>

    @POST("ForgetPassward")
    fun forgetPassword(@Body forgetPass: ForgetPasswordRequest): Call<ForgetPasswordResponse>

    @POST("getLevels")
    fun getLevel(
            @Body getLevel: GetLevelRequest): Call<GetLevelResponse>

    @POST("GetPatientProfile")
    fun getPatientProfile(
            @Body getPatientProfile: GetPatientProfileRequest): Call<GetPatientProfileResponse>

    @POST("UpdatePatientProfile")
    fun insertPatientProfile(
            @Body insertPatientProfile: PatientInfoRequest): Call<PatientInfoResponse>

    @POST("getInstrumentations")
    fun getInstrument(
            @Body getInstrument: InstrumentRequest): Call<InstrumentResponse>

    @get:GET("getManufacturers")
    val manufacturer: Call<ManufacturersResponse>

    @POST("GetQuestions")
    fun getQuestionnaire(
            @Body getQuestionnaire: PatientQuestionnaireRequest): Call<PatientQuestionnaireResponse>

    @GET("GetTreatments")
    fun getTreatments(): Call<PatientTreatmentMainResponse>

    //void getMainTreatments(Callback<PatientTreatmentMainResponse> uscb);
    @POST("GetSubTreatments")
    fun getSubTreatment(
            @Body getSubTreatment: PatientTreatmentSubRequest): Call<PatientTreatmentSubResponse>

    @get:GET("GetDepartments")
    val departments: Call<PhysicianDepResponse>

    @POST("GetPhysician")
    fun getPhysicianName(
            @Body getSubTreatment: PhysicianNameRequest): Call<PhysicianNameResponse>

    @POST("getProcedures")
    fun getProcedure(
            @Body getProcedure: ProcedureRequest): Call<ProcedureResponse>

    @POST("ChangePassward")
    fun resetPassword(@Body resetPassdordResqust: ResetPasswordRequest): Call<ResetPasswordResponce>

    @POST("PerformLogin")
    fun signinPost(
            @Body signinPost: SigninRequest): Call<SigninResponse>

    @POST("RegisterPatient")
    fun signupPost(
            @Body signupPost: SignupRequest): Call<SignupResponse>
}

