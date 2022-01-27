package serviciosWeb;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Entity;
import modelo.Producto;

public class ProductoClient {

    String URI = "http://localhost:8080/ProductoREST/webresources/producto";
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target(URI);

    //Get Productos
    public void getProductos() {
        String response = target.request().accept(MediaType.APPLICATION_JSON)
                .get(String.class);
        System.out.println(response);
    }

    //POST Producto
    public void postProducto() {
        Producto pro = new Producto(113, "CHEVROLET", "JOY PLUS", "SUMMIT WHITE", 1858900.0, 20800.0);
        String response = target.request()
                .post(Entity.entity(pro, MediaType.APPLICATION_JSON), String.class);
        System.out.println(response);
    }

}
