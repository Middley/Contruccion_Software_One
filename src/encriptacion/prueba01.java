
package encriptacion;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.management.RuntimeErrorException;

public class prueba01 {
    
    
    public static String getMD5(String entrada){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] mensajesDigitos = md.digest(entrada.getBytes());
            BigInteger numero = new BigInteger(1,mensajesDigitos);
            String hashtext = numero.toString(16);
            
            while (hashtext.length()<32){
                hashtext = "0" + hashtext;
            }
            return hashtext;
            
        } catch (NoSuchAlgorithmException e) {
            throw  new RuntimeErrorException(e);
        }
    }
    
    
    public static void main(String[] args) {        
        getMD5("1");
        System.out.println(getMD5("1"));                
    }
    
}

class DesencirptarMD5{
    
    public void des(String contra){
        
    }
    
    
}