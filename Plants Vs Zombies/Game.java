package application;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*; 
import java.io.*; 
import javafx.geometry.*; 
import javafx.scene.Group; 
  
public class Game extends Application { 
  
    Scene in_game_menu;
    Scene playground;
    Scene main_scene;
    Scene level1_scene;
    Scene level2_scene;
    Scene level3_scene;
    int level = 1;
    
    public void start(Stage stage) 
    { 
  
        try { 
  
            // LEVEL1
            
            
            
            FileInputStream level_input = new FileInputStream("D:\\level1.jpg");
            StackPane first = new StackPane();
            Image level1_image = new Image(level_input);
            BackgroundImage level1_backgroundimage = new BackgroundImage(level1_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT); 

            Background level1 = new Background(level1_backgroundimage);
            first.setBackground(level1);
            
            level_input = new FileInputStream("D:\\right.png");
            Image right_image = new Image(level_input);
            BackgroundImage right_background = new BackgroundImage(right_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background right_back = new Background(right_background);
            Button right_button = new Button();
            right_button.setOnAction(e -> stage.setScene(level2_scene));
            right_button.setBackground(right_back);
            right_button.setMinSize(80, 80);
            right_button.setTranslateX(110);
            
            level_input = new FileInputStream("D:\\left.png");
            Image left_image = new Image(level_input);
            BackgroundImage left_background = new BackgroundImage(left_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background left_back = new Background(left_background);
            Button left_button = new Button();
            left_button.setOnAction(e -> stage.setScene(level1_scene));
            left_button.setBackground(left_back);
            left_button.setMinSize(80, 80);
            left_button.setTranslateX(-110);
            
            level_input = new FileInputStream("D:\\level1_name.png");
            Image level1_name_image = new Image(level_input);
            BackgroundImage level1_background = new BackgroundImage(level1_name_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background level1_back = new Background(level1_background);
            Button level1_button = new Button();
            level1_button.setOnAction(e -> stage.setScene(playground));
            level1_button.setBackground(level1_back);
            level1_button.setMinSize(100, 100);
            
            level_input = new FileInputStream("D:\\back.png");
            Image back_image1 = new Image(level_input);
            BackgroundImage back_background1 = new BackgroundImage(back_image1,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background back_back1 = new Background(back_background1);
            Button back_button1 = new Button();
            back_button1.setOnAction(e -> stage.setScene(main_scene));
            back_button1.setBackground(back_back1);
            back_button1.setMinSize(100, 100);
            back_button1.setTranslateX(-170);
            back_button1.setTranslateY(-310);
            
            
            HBox arrow_box1 = new HBox();
            arrow_box1.getChildren().add(left_button);
            arrow_box1.getChildren().add(level1_button);
            arrow_box1.getChildren().add(right_button);
            arrow_box1.setAlignment(Pos.CENTER);
            
            first.getChildren().add(arrow_box1);
            first.getChildren().add(back_button1);
            
            level1_scene = new Scene(first,450,750);
            
            
            
            
            // LEVEL 2
            
            level_input = new FileInputStream("D:\\level2.jpg");
            StackPane second = new StackPane();
            Image level2_image = new Image(level_input);
            BackgroundImage level2_backgroundimage = new BackgroundImage(level2_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT); 

            Background level2 = new Background(level2_backgroundimage);
            second.setBackground(level2);
            
            level_input = new FileInputStream("D:\\right.png");
            Image right_image2 = new Image(level_input);
            BackgroundImage right_background2 = new BackgroundImage(right_image2,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background right_back2 = new Background(right_background2);
            Button right_button2 = new Button();
            right_button2.setOnAction(e -> stage.setScene(level3_scene));
            right_button2.setBackground(right_back2);
            right_button2.setMinSize(80, 80);
            right_button2.setTranslateX(110);
            
            level_input = new FileInputStream("D:\\left.png");
            Image left_image2 = new Image(level_input);
            BackgroundImage left_background2 = new BackgroundImage(left_image2,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background left_back2 = new Background(left_background2);
            Button left_button2 = new Button();
            left_button2.setOnAction(e -> stage.setScene(level1_scene));
            left_button2.setBackground(left_back2);
            left_button2.setMinSize(80, 80);
            left_button2.setTranslateX(-110);
            
            level_input = new FileInputStream("D:\\level2_name.png");
            Image level2_name_image = new Image(level_input);
            BackgroundImage level2_background = new BackgroundImage(level2_name_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background level2_back = new Background(level2_background);
            Button level2_button = new Button();
            level2_button.setOnAction(e -> stage.setScene(playground));
            level2_button.setBackground(level2_back);
            level2_button.setMinSize(100, 100);
            
            level_input = new FileInputStream("D:\\back.png");
            Image back_image2 = new Image(level_input);
            BackgroundImage back_background2 = new BackgroundImage(back_image2,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background back_back2 = new Background(back_background2);
            Button back_button2 = new Button();
            back_button2.setOnAction(e -> stage.setScene(main_scene));
            back_button2.setBackground(back_back2);
            back_button2.setMinSize(100, 100);
            back_button2.setTranslateX(-170);
            back_button2.setTranslateY(-310);
            
            
            HBox arrow_box2 = new HBox();
            arrow_box2.getChildren().add(left_button2);
            arrow_box2.getChildren().add(level2_button);
            arrow_box2.getChildren().add(right_button2);
            arrow_box2.setAlignment(Pos.CENTER);
            
            second.getChildren().add(arrow_box2);
            second.getChildren().add(back_button2);
            
            level2_scene = new Scene(second,450,750);
            
            
            // LEVEL 3
            
            level_input = new FileInputStream("D:\\level3.png");
            StackPane third = new StackPane();
            Image level3_image = new Image(level_input);
            BackgroundImage level3_backgroundimage = new BackgroundImage(level3_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT); 

            Background level3 = new Background(level3_backgroundimage);
            third.setBackground(level3);
            
            level_input = new FileInputStream("D:\\right.png");
            Image right_image3 = new Image(level_input);
            BackgroundImage right_background3 = new BackgroundImage(right_image3,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background right_back3 = new Background(right_background3);
            Button right_button3 = new Button();
            right_button3.setOnAction(e -> stage.setScene(level3_scene));
            right_button3.setBackground(right_back3);
            right_button3.setMinSize(80, 80);
            right_button3.setTranslateX(110);
            
            level_input = new FileInputStream("D:\\left.png");
            Image left_image3 = new Image(level_input);
            BackgroundImage left_background3 = new BackgroundImage(left_image3,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background left_back3 = new Background(left_background3);
            Button left_button3 = new Button();
            left_button3.setOnAction(e -> stage.setScene(level2_scene));
            left_button3.setBackground(left_back3);
            left_button3.setMinSize(80, 80);
            left_button3.setTranslateX(-110);
            
            level_input = new FileInputStream("D:\\level3_name.png");
            Image level3_name_image = new Image(level_input);
            BackgroundImage level3_background = new BackgroundImage(level3_name_image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background level3_back = new Background(level3_background);
            Button level3_button = new Button();
            level3_button.setOnAction(e -> stage.setScene(playground));
            level3_button.setBackground(level3_back);
            level3_button.setMinSize(100, 100);
            
            level_input = new FileInputStream("D:\\back.png");
            Image back_image3 = new Image(level_input);
            BackgroundImage back_background3 = new BackgroundImage(back_image3,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background back_back3 = new Background(back_background3);
            Button back_button3 = new Button();
            back_button3.setOnAction(e -> stage.setScene(main_scene));
            back_button3.setBackground(back_back3);
            back_button3.setMinSize(100, 100);
            back_button3.setTranslateX(-170);
            back_button3.setTranslateY(-310);
            
            
            HBox arrow_box3 = new HBox();
            arrow_box3.getChildren().add(left_button3);
            arrow_box3.getChildren().add(level3_button);
            arrow_box3.getChildren().add(right_button3);
            arrow_box3.setAlignment(Pos.CENTER);
            
            
            third.getChildren().add(arrow_box3);
            third.getChildren().add(back_button3);
            
            level3_scene = new Scene(third,450,750);
            
            
            
            // MAIN MENU
            
            stage.setTitle("Plants VS Zombies"); 
            
            Image button_image  = new Image("http://icons.iconarchive.com/icons/icons8/halloween/512/zombie-icon.png");
            Image button_image1  = new Image("http://icons.iconarchive.com/icons/icons8/halloween/512/zombie-icon.png");
            Image button_image2  = new Image("http://icons.iconarchive.com/icons/icons8/halloween/512/zombie-icon.png");
            Image button_image3  = new Image("http://icons.iconarchive.com/icons/icons8/halloween/512/zombie-icon.png");

            ImageView imageView = new ImageView(button_image);
            ImageView imageviewplant = new ImageView(button_image1);
            ImageView imageView1 = new ImageView(button_image2);
            ImageView imageviewplant1 = new ImageView(button_image3);
            

            imageView.setFitWidth(70);
            imageView.setFitHeight(40);
            imageviewplant.setFitWidth(70);
            imageviewplant.setFitHeight(40);
            imageView1.setFitWidth(70);
            imageView1.setFitHeight(40);
            imageviewplant1.setFitWidth(70);
            imageviewplant1.setFitHeight(40);
            
            Button new_game_button = new Button("New Game");
            new_game_button.setGraphic(imageView);
            new_game_button.setOnAction(e -> stage.setScene(playground));
            new_game_button.setStyle("-fx-background-color: #00ff00");
            
            new_game_button.setTranslateX(300);
            new_game_button.setTranslateY(330);
            new_game_button.setMaxSize(300, 50);
            
            
            Button load_game_button = new Button("Load Game");
            load_game_button.setGraphic(imageviewplant);
            load_game_button.setStyle("-fx-background-color: #808080");
            load_game_button.setOnAction(new EventHandler<ActionEvent>() {
     
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Load Game started");
                }
            });
            
            load_game_button.setTranslateX(300);
            load_game_button.setTranslateY(280);
            load_game_button.setMaxSize(300, 50);
            
            Button choose_level_button = new Button("Choose Level");
            choose_level_button.setGraphic(imageView1);
            choose_level_button.setStyle("-fx-background-color: #00ff00");
            choose_level_button.setOnAction(e -> stage.setScene(level1_scene));
            
            choose_level_button.setTranslateX(300);
            choose_level_button.setTranslateY(230);
            choose_level_button.setMaxSize(300, 50);
            
            Button exit_button = new Button("Exit Game");
            exit_button.setGraphic(imageviewplant1);
            exit_button.setStyle("-fx-background-color: #808080");
            exit_button.setOnAction(new EventHandler<ActionEvent>() {
     
                @Override
                public void handle(ActionEvent event) {
                    System.exit(0);
                }
            });
            
            exit_button.setTranslateX(300);
            exit_button.setTranslateY(180);
            exit_button.setMaxSize(300, 50);
            
            VBox vbox = new VBox( new_game_button, load_game_button, choose_level_button, exit_button); 
            vbox.setSpacing(100); 
            vbox.setAlignment(Pos.CENTER); 
            main_scene = new Scene(vbox, 1270, 950); 
            
            FileInputStream main_input = new FileInputStream("D:\\background.jpg"); 
            Image pvz = new Image(main_input);
            BackgroundImage main_backgroundimage = new BackgroundImage(pvz,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundPosition.DEFAULT,  
                                                BackgroundSize.DEFAULT); 
  
            Background main_background = new Background(main_backgroundimage); 
            vbox.setBackground(main_background);
            
            
            
            // IN GAME MENU
            
            StackPane menu_pane = new StackPane();
            
            Button save_game_button = new Button();
            save_game_button.setText("Save Game");

            save_game_button.setOnAction(new EventHandler<ActionEvent>() {
     
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Game Saved");
                }
            });
            
            save_game_button.setTranslateX(0);
            save_game_button.setTranslateY(180);
            
            Button exit_game_button = new Button();
            exit_game_button.setText("Exit Game");

            exit_game_button.setOnAction(e -> stage.setScene(main_scene));
            
            exit_game_button.setTranslateX(0);
            exit_game_button.setTranslateY(180);
            
            Button continue_button = new Button("Continue");
            continue_button.setOnAction(e -> stage.setScene(playground));
            
            continue_button.setAlignment(Pos.CENTER);
            continue_button.setTranslateX(0);
            continue_button.setTranslateY(230);
            
            HBox button_box = new HBox(save_game_button,exit_game_button);
            button_box.setSpacing(30);
            button_box.setAlignment(Pos.CENTER);
            
            
            
            FileInputStream input = new FileInputStream("D:\\menu.jpg");
            Image image = new Image(input);
            BackgroundImage backgroundimage = new BackgroundImage(image,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.CENTER,  
                       BackgroundSize.DEFAULT);
            
            Background background = new Background(backgroundimage); 
            menu_pane.setBackground(background);
            
            input.close();
            input = new FileInputStream("D:\\zombie.png");
            Image zombie = new Image(input);
            ImageView img = new ImageView(zombie);
            
            input.close();
            
            HBox zomb_box = new HBox();
            zomb_box.getChildren().add(img);
            zomb_box.setAlignment(Pos.CENTER);
            
            menu_pane.getChildren().add(zomb_box);
            menu_pane.getChildren().add(button_box);
            menu_pane.getChildren().add(continue_button);
            
            in_game_menu = new Scene(menu_pane,450,675);
            
            
            
            //MAKING PLAYGROUND SCENE
            
            input = new FileInputStream("D:\\pea_selection.png");
            Image peashooter = new Image(input);
            BackgroundImage pea_background = new BackgroundImage(peashooter,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background pea_back = new Background(pea_background); 
            
            input = new FileInputStream("D:\\snowpea_selection.png");
            Image snowpea = new Image(input);
            BackgroundImage snowpea_background = new BackgroundImage(snowpea,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background snowpea_back = new Background(snowpea_background);
            
            input = new FileInputStream("D:\\repeater_selection.png");
            Image repeater = new Image(input);
            BackgroundImage repeater_background = new BackgroundImage(repeater,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background repeater_back = new Background(repeater_background);
            
            input = new FileInputStream("D:\\cherry_selection.png");
            Image cherrybomb = new Image(input);
            BackgroundImage cherry_background = new BackgroundImage(cherrybomb,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background cherry_back = new Background(cherry_background);
            
            input = new FileInputStream("D:\\mine_selection.png");
            Image potatomine = new Image(input);
            BackgroundImage potato_background = new BackgroundImage(potatomine,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background potato_back = new Background(potato_background);
            
            input = new FileInputStream("D:\\sunflower_selection.png");
            Image sunflower = new Image(input);
            BackgroundImage sunflower_background = new BackgroundImage(sunflower,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundRepeat.NO_REPEAT,  
                    BackgroundPosition.DEFAULT,  
                       BackgroundSize.DEFAULT);
            Background sunflower_back = new Background(sunflower_background);
            
            Button pea_button = new Button();
            pea_button.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Pea Shooter selected");
                }
            });
            pea_button.setMinSize(80, 49);
            pea_button.setBackground(pea_back);
            
            Button snowpea_button = new Button();
            snowpea_button.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Snow Pea selected");
                }
            });
            snowpea_button.setMinSize(80, 49);
            snowpea_button.setBackground(snowpea_back);
            
            Button repeater_button = new Button();
            repeater_button.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Repeater selected");
                }
            });
            repeater_button.setMinSize(80, 52);
            repeater_button.setBackground(repeater_back);
            
            Button cherry_button = new Button();
            cherry_button.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Cherry Bomb selected");
                }
            });
            cherry_button.setMinSize(80, 54);
            cherry_button.setBackground(cherry_back);
            
            Button potato_button = new Button();
            potato_button.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Potato Mine selected");
                }
            });
            potato_button.setMinSize(80, 54);
            potato_button.setBackground(potato_back);
            
            Button sunflower_button = new Button();
            sunflower_button.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Sunflower selected");
                }
            });
            sunflower_button.setMinSize(80, 52);
            sunflower_button.setBackground(sunflower_back);
            
            input = new FileInputStream("D:\\sun.png");
            Image sun_image = new Image(input);
            ImageView sun = new ImageView(sun_image);
            Label sun_no = new Label("0");
            sun_no.setStyle("-fx-background-color: #ffffff");
            sun_no.setMinSize(60, 40);
            sun_no.setFont(new Font(30));
            
            VBox plants_box = new VBox(pea_button, snowpea_button, repeater_button, cherry_button, potato_button, sunflower_button,sun,sun_no);
            plants_box.setAlignment(Pos.TOP_LEFT);
            plants_box.setTranslateY(-70);
            
            input = new FileInputStream("D:\\pea.gif");
            Image pea_image = new Image(input);
            ImageView pea = new ImageView(pea_image);
            
            input.close();
            
            HBox pea_box = new HBox();
            pea_box.getChildren().add(pea);
            
            Button pause_button = new Button();
            pause_button.setText("Pause");
            pause_button.setTranslateX(-20);
            pause_button.setTranslateY(10);
            pause_button.setOnAction(e -> stage.setScene(in_game_menu));

            
            VBox vboxx = new VBox(pause_button);  
            vboxx.setAlignment(Pos.TOP_RIGHT); 
            
            pea_box.setTranslateX(205);
            pea_box.setTranslateY(112);
            
            FileInputStream playground_input = new FileInputStream("D:\\lawn3.jpg"); 
            
            Image yard = new Image(playground_input); 
            BackgroundImage playground_backgroundimage = new BackgroundImage(yard,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundPosition.DEFAULT,  
                                                BackgroundSize.DEFAULT); 
            Background playground_background = new Background(playground_backgroundimage); 
            vboxx.setBackground(playground_background); 
            vboxx.getChildren().add(pea_box);
            vboxx.getChildren().add(plants_box);
            playground = new Scene(vboxx, 800, 477);
            
             
  
            // set the scene 
            stage.setScene(main_scene); 
  
            stage.show(); 
        } 
  
        catch (Exception e) { 
  
            System.out.println(e.getMessage()); 
        } 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    } 
}
