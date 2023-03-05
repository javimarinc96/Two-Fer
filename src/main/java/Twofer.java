public class Twofer {
    
    public String twofer(String name) {
        String res = "";
        if(name == null || name.trim().isEmpty()){
            res = "One for you, one for me."; 
        }else{
            res = "One for " + name + ", one for me."; 
        }
        return res;
    }
    
}
