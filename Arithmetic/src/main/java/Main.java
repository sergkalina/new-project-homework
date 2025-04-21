import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Ошибка передачи параметров\nТребуется один параметр");
            System.exit(1);
        }

        String url = args[0];
        System.out.println("URL from args:" + url);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                System.out.println("Response: " + responseBody);
            } else {
                System.out.println("Request failed with HTTP error code: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//        arithmetic.sum();
//        arithmetic.multiplication();
//        arithmetic.maxNumber();
//        arithmetic.minNumber();

