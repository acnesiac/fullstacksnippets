package behavioral.observer.improved;


public class InputText implements Observer {

    public void setText(String text){
        System.out.println("Inputtext set text: "+text);
    }


    
    public void update() {
        this.setText("button has been clicked");
    }
}
