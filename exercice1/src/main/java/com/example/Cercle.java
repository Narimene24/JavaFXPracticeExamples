
    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.scene.layout.StackPane;
    import javafx.scene.paint.Color;
    import javafx.scene.shape.Circle;
    import javafx.stage.Stage;
    

public class Cercle  extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
    
        StackPane root = new StackPane();
        
        // Creer la forme 2D que vous voulez afficher sur le paneau 

        Circle circle = new Circle(400, 400, 200);
        circle.setFill(Color.BLUEVIOLET);

        //  Définir le Path entre le noeud root et le nouveau noeud Circle

        root.getChildren().add(circle);    // StackPane root = new StackPane(circle);

        //  instancier la scene et passer le root du contenue graphique en parametres

        Scene scene = new Scene(root);

        //  configurer la scene / Stage

        primaryStage.setTitle("Dessiner un cercle");
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);

        primaryStage.setScene(scene);
        primaryStage.show();
            }
        public static void main (String [] args) {
            launch(args);
        }
    }



   