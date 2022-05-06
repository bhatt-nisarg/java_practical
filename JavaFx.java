import javafx.application.*;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;  
public class Javafx extends Application{  
    @Override  
    public void start(Stage s) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1=new Button("Say, Hello World");  
	btn1.setOnAction(new EventHandler<ActionEvent>() {  
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                System.out.println("hello world");  
            }  
        });  
       StackPane p=new StackPane();  
        p.getChildren().add(btn1);  
        Scene sc=new Scene(p,600,400);      
	s.setTitle("First JavaFX Application");  
        s.setScene(sc);  
        s.show();  
    }  
    public static void main (String[] args)  
    {  
        launch(args);  
    }   
}  
