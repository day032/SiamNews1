package siam.go.mint.num.siamdailynew.manage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

/**
 * Created by day.k on 22/8/2560.
 */

public class PostNewMember extends AsyncTask<String, Void, String>{
    private Context context;
    public  PostNewMember(Context context){
        this.context = context;
    }


    @Override
    protected String doInBackground(String... strings) {
        try{

            MyConstant myConstant = new MyConstant();
            String[] coStrings1 = myConstant.getCoulmMemberString();
            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd","true")
                    .add(coStrings1[0], strings[0])
                    .add(coStrings1[1], strings[1])
                    .add(coStrings1[2], strings[2])
                    .add(coStrings1[3], strings[3])
                    .add(coStrings1[4], strings[4])
                    .add(coStrings1[5], strings[5])
                    .add(coStrings1[6], strings[6])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[7]).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();
            return  response.body().string();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }//main Class
}
