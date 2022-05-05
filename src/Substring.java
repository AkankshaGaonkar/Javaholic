public class Substring {
    public static void main(String args[]){
        String str="programmmer@hotmail.com";
        int i=str.indexOf("@");
        String username =str.substring(0,i);
        String domainName=str.substring(i+1,str.length());
        System.out.println("Username="+username);
        System.out.println("DomainName="+domainName);
        int j=domainName.indexOf(".");
        String name=domainName.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}
