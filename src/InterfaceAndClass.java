class phone
{
    void call()
    {
        System.out.println("Phone Call");
    }
    void sms()
    {
        System.out.println("Send Message");
    }

}
interface cameraClick{
    void click();
    void videocall();
}
interface musicPlayer
{
    void play();
    void rewind();
}
class iphone extends phone implements cameraClick,musicPlayer
{
    @Override
    public void videocall() {
        System.out.println("Smart Phone video calling");
    }
    public void click()
    {
        System.out.println("Cam click");
    }

    @Override
    public void play() {
        System.out.println("play");
    }
    public void rewind()
    {
        System.out.println("rewind");
    }
    public void callRecorder()
    {
        System.out.println("Record call");
    }

}
public class InterfaceAndClass {
    public static void main(String args[])
    {
        phone p=new iphone();
        p.call();
        p.sms();
        cameraClick c =new iphone();
        c.click();
        c.videocall();
        musicPlayer m = new iphone();
        m.play();;
        m.rewind();
        iphone i = new iphone();
        i.click();//mtd implemented from interface cameraclick
        i.callRecorder();//its own method
        i.sms();//mtd extended from class phone
    }
}
