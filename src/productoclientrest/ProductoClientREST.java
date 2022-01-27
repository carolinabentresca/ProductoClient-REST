package productoclientrest;

import serviciosWeb.ProductoClient;

public class ProductoClientREST {

    public static void main(String[] args) {
        //Instanciamos la clase Client
        ProductoClient cliente = new ProductoClient();
        cliente.getProductos();
    }

}
