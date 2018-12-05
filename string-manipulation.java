import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HelloWorld {
  public static void main(String[] args) {
    String myStr = "<div class=\"channelListEntry\"><a href=\"/ariana_grande\"><div class=\"image\"><img src=\"http://cdn.posh24.se/images/:profile/09bd8ba96c471ecd93343b69de668399d\" alt=\"Ariana Grande\"/></div> <div class=\"info\"><div class=\"status-container\"><div class=\"position\">1</div><div class=\"value\">-</div></div><div class=\"name\">Ariana Grande</div></div></a></div><div class=\"channelListEntry\"><a href=\"/avicii\"><div class=\"image\"><img src=\"http://cdn.posh24.se/images/:profile/00febb8fad9648662172a6985bf5f3176\" alt=\"Avicii\"/></div> <div class=\"info\"><div class=\"status-container\"><div class=\"position\">2</div> <div class=\"img pos\"></div><div class=\"value\">+72</div></div><div class=\"name\">Avicii</div></div></a></div>";
    
    //1. SPLIT
    // String[] splitStr = myStr.split("s");
    // System.out.println(Arrays.toString(splitStr));
    
    //2. SUBSTRING
    // System.out.println(myStr.substring(4, 8));
    
    //3. REGEX
    // Pattern p = Pattern.compile("Mi(.*?)pi");
    // Matcher m = p.matcher(myStr);
    
    // while(m.find()) {
        
    //     System.out.println(m.group(1));
        
    // }
    
    Pattern p = Pattern.compile("src=\"(.*?)\"");
    Matcher m = p.matcher(myStr);
    
    while(m.find()) {
        
        System.out.println(m.group(1));
        
    }
    
  }
}
