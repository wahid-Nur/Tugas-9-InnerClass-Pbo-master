interface Clickable {
    void onClick();
}
class Button {
    private Clickable action;
    void setClickAction(Clickable action){
        this.action = action;
    }
    void doClick(){
        action.onClick();
    }
}
public class Anonymous {
    public static void main(String[] args) { 
        Button btn = new Button();        
        btn.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
            }
        });        
        btn.doClick();
        
    }
}