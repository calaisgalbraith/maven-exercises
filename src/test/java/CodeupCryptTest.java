import maven.CodeupCrypt;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testVersion(){
        CodeupCrypt.version = 0.0;
        assertEquals(0.0, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("j9b1l33", CodeupCrypt.hashPassword("jubilee"));
        assertEquals("ch4n3l", CodeupCrypt.hashPassword("chanel"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue(CodeupCrypt.checkPassword("jubilee", "j9b1l33"));
    }

}
