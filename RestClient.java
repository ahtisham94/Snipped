
//Add This Funcation in RestClient
fun performResetPasswordRequest(obj: Callback<ResetPasswordResponce>, resetPasswordResquest: ResetPasswordRequest) {
        retrofit?.create(APIIntrface::class.java)?.resetPassword(resetPasswordResquest)?.enqueue(obj)
    }

    fun recoverPassword(response: ResponsesForAPI, recover: ForgetPasswordRequest) {
        val call = retrofit?.create(APIIntrface::class.java)?.forgetPassword(recover)
        callRetrofit(call!!, response)
    }

    fun <T> callRetrofit(call: Call<T>, interfacess: ResponsesForAPI) {
        call.enqueue(object : retrofit2.Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {

                if (response.isSuccessful) {
                    interfacess.success(response.body()!!)
                } else {
                    try {
                        interfacess.failure(response.errorBody()!!.toString())
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                interfacess.failure(t.localizedMessage)
            }
        })

    }
    
    
