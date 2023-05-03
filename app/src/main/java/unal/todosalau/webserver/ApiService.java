package unal.todosalau.webserver;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("users")
    Call<List<User>> obtenerUsuarios();

}
