package exercice03;
import exercice03.IncompatibleDataFormatException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.util.zip.DataFormatException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    @Test
    void getProductRecupReussTest() {
        ProductApiClient productApiClient = mock(ProductApiClient.class);
        ProductService productService = new ProductService(productApiClient);
        Product p =  new Product("T-shirt","100");
        when(productApiClient.getProduct("100")).thenReturn(p);
        try {
            Product pi = productService.getProduct("100");
            verify(productApiClient).getProduct("100");
            assertEquals("100", pi.getId());
            assertEquals("T-shirt", pi.getNom());
        }catch (IncompatibleDataFormatException e ){
            System.out.println("IncompatibleDataFormatException");
        }


    }
    @Test
    void getProductFormatIncompaTest() {
        ProductApiClient productApiClient = mock(ProductApiClient.class);
        ProductService productService = new ProductService(productApiClient);

        when(productApiClient.getProduct("100")).thenThrow(new IncompatibleDataFormatException());
        productService.getProduct("100")
        verify(productApiClient).getProduct("100");
        assertThrows(DataFormatException.class,() -> productService.getProduct("100"));

    }
}