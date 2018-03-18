import java.math.BigDecimal;
import java.math.RoundingMode;

public class Round {
    private static final float n = 2.7182818284590452353602875f;
    public static void main (String[] args ){
        BigDecimal bd = new BigDecimal(n);
        System.out.println(bd.setScale(8, RoundingMode.HALF_UP).floatValue());
    }
}
