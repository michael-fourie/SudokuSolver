package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SodokuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button generateBoard;
    @FXML
    private TextArea box1;
    @FXML
    private TextArea box2;
    @FXML
    private TextArea box3;
    @FXML
    private TextArea box4;
    @FXML
    private TextArea box5;
    @FXML
    private TextArea box6;
    @FXML
    private TextArea box7;
    @FXML
    private TextArea box8;
    @FXML
    private TextArea box9;
    @FXML
    private TextArea box10;
    @FXML
    private TextArea box11;
    @FXML
    private TextArea box12;
    @FXML
    private TextArea box13;
    @FXML
    private TextArea box14;
    @FXML
    private TextArea box15;
    @FXML
    private TextArea box16;
    @FXML
    private TextArea box17;
    @FXML
    private TextArea box18;
    @FXML
    private TextArea box19;
    @FXML
    private TextArea box20;
    @FXML
    private TextArea box21;
    @FXML
    private TextArea box22;
    @FXML
    private TextArea box23;
    @FXML
    private TextArea box24;
    @FXML
    private TextArea box25;
    @FXML
    private TextArea box26;
    @FXML
    private TextArea box27;
    @FXML
    private TextArea box28;
    @FXML
    private TextArea box29;
    @FXML
    private TextArea box30;
    @FXML
    private TextArea box31;
    @FXML
    private TextArea box32;
    @FXML
    private TextArea box33;
    @FXML
    private TextArea box34;
    @FXML
    private TextArea box35;
    @FXML
    private TextArea box36;
    @FXML
    private TextArea box37;
    @FXML
    private TextArea box38;
    @FXML
    private TextArea box39;
    @FXML
    private TextArea box40;
    @FXML
    private TextArea box41;
    @FXML
    private TextArea box42;
    @FXML
    private TextArea box43;
    @FXML
    private TextArea box44;
    @FXML
    private TextArea box45;
    @FXML
    private TextArea box46;
    @FXML
    private TextArea box47;
    @FXML
    private TextArea box48;
    @FXML
    private TextArea box49;
    @FXML
    private TextArea box50;
    @FXML
    private TextArea box51;
    @FXML
    private TextArea box52;
    @FXML
    private TextArea box53;
    @FXML
    private TextArea box54;
    @FXML
    private TextArea box55;
    @FXML
    private TextArea box56;
    @FXML
    private TextArea box57;
    @FXML
    private TextArea box58;
    @FXML
    private TextArea box59;
    @FXML
    private TextArea box60;
    @FXML
    private TextArea box61;
    @FXML
    private TextArea box62;
    @FXML
    private TextArea box63;
    @FXML
    private TextArea box64;
    @FXML
    private TextArea box65;
    @FXML
    private TextArea box66;
    @FXML
    private TextArea box67;
    @FXML
    private TextArea box68;
    @FXML
    private TextArea box69;
    @FXML
    private TextArea box70;
    @FXML
    private TextArea box71;
    @FXML
    private TextArea box72;
    @FXML
    private TextArea box73;
    @FXML
    private TextArea box74;
    @FXML
    private TextArea box75;
    @FXML
    private TextArea box76;
    @FXML
    private TextArea box77;
    @FXML
    private TextArea box78;
    @FXML
    private TextArea box79;
    @FXML
    private TextArea box80;
    @FXML
    private TextArea box81;
    @FXML
    private Button backtrack;
    
    @FXML
    private Button clearboard;
    
    int[][] board;
    
    @FXML
    private void clearboardClicked(ActionEvent clearboard) {
    	for(int i = 0; i < 9; i++)
    		for(int j = 0; j < 9; j++)
    			board[i][j] = 0;
    	displayBoard(board);
    }
 
    @FXML
    private void backtrackButtonClicked(ActionEvent backtrack) {
    	
    	if (solvingAlgorithm.backTrackAlgorithm(board))
    		displayBoard(board);
    }
    
    @FXML
    private void generateBoardClicked(ActionEvent generateBoard) {
    	board = createBoard.generateValidBoard();
    	displayBoard(board);
    }
    
    private void displayBoard(int[][] board) {
    	if (board[0][0] != 0)
    		box1.setText(Integer.toString(board[0][0]));
    	else
    		box1.setText("");
    	if (board[0][1] != 0)
    		box2.setText(Integer.toString(board[0][1]));
    	else
    		box2.setText("");
    	if (board[0][2] != 0)
    		box3.setText(Integer.toString(board[0][2]));
    	else 
    		box3.setText("");
    	if(board[0][3] != 0)
    		box4.setText(Integer.toString(board[0][3]));
    	else
    		box4.setText("");
    	if(board[0][4] != 0)
    		box5.setText(Integer.toString(board[0][4]));
    	else
    		box5.setText("");
    	if (board[0][5] != 0)
    		box6.setText(Integer.toString(board[0][5]));
    	else
    		box6.setText("");
    	if (board[0][6] != 0)
    		box7.setText(Integer.toString(board[0][6]));
    	else 
    		box7.setText("");
    	if (board[0][7] != 0)
    		box8.setText(Integer.toString(board[0][7]));
    	else
    		box8.setText("");
    	if (board[0][8] != 0)
    		box9.setText(Integer.toString(board[0][8]));
    	else
    		box9.setText("");
    	
    	
    	if (board[1][0] != 0)
    		box10.setText(Integer.toString(board[1][0]));
    	else
    		box10.setText("");
    	if (board[1][1] != 0)
    		box11.setText(Integer.toString(board[1][1]));
    	else
    		box11.setText("");
    	if (board[1][2] != 0)
    		box12.setText(Integer.toString(board[1][2]));
    	else 
    		box12.setText("");
    	if(board[1][3] != 0)
    		box13.setText(Integer.toString(board[1][3]));
    	else
    		box13.setText("");
    	if(board[1][4] != 0)
    		box14.setText(Integer.toString(board[1][4]));
    	else
    		box14.setText("");
    	if (board[1][5] != 0)
    		box15.setText(Integer.toString(board[1][5]));
    	else
    		box15.setText("");
    	if (board[1][6] != 0)
    		box16.setText(Integer.toString(board[1][6]));
    	else 
    		box16.setText("");
    	if (board[1][7] != 0)
    		box17.setText(Integer.toString(board[1][7]));
    	else
    		box17.setText("");
    	if (board[1][8] != 0)
    		box18.setText(Integer.toString(board[1][8]));
    	else
    		box18.setText("");

    	if (board[2][0] != 0)
    		box19.setText(Integer.toString(board[2][0]));
    	else
    		box19.setText("");
    	if (board[2][1] != 0)
    		box20.setText(Integer.toString(board[2][1]));
    	else
    		box20.setText("");
    	if (board[2][2] != 0)
    		box21.setText(Integer.toString(board[2][2]));
    	else
    		box21.setText("");
    	if (board[2][3] != 0)
    		box22.setText(Integer.toString(board[2][3]));
    	else
    		box22.setText("");
    	if (board[2][4] != 0)
    		box23.setText(Integer.toString(board[2][4]));
    	else
    		box23.setText("");
    	if (board[2][5] != 0)
    		box24.setText(Integer.toString(board[2][5]));
    	else
    		box24.setText("");
    	if (board[2][6] != 0)
    		box25.setText(Integer.toString(board[2][6]));
    	else
    		box25.setText("");
    	if (board[2][7] != 0)
    		box26.setText(Integer.toString(board[2][7]));
    	else
    		box26.setText("");
    	if (board[2][8] != 0)
    		box27.setText(Integer.toString(board[2][8]));
    	else
    		box27.setText("");

    	if (board[3][0] != 0)
    		box28.setText(Integer.toString(board[3][0]));
    	else
    		box28.setText("");
    	if (board[3][1] != 0)
    		box29.setText(Integer.toString(board[3][1]));
    	else
    		box29.setText("");
    	if (board[3][2] != 0)
    		box30.setText(Integer.toString(board[3][2]));
    	else
    		box30.setText("");
    	if (board[3][3] != 0)
    		box31.setText(Integer.toString(board[3][3]));
    	else
    		box31.setText("");
    	if (board[3][4] != 0)
    		box32.setText(Integer.toString(board[3][4]));
    	else
    		box32.setText("");
    	if (board[3][5] != 0)
    		box33.setText(Integer.toString(board[3][5]));
    	else
    		box33.setText("");
    	if (board[3][6] != 0)
    		box34.setText(Integer.toString(board[3][6]));
    	else
    		box34.setText("");
    	if (board[3][7] != 0)
    		box35.setText(Integer.toString(board[3][7]));
    	else
    		box35.setText("");
    	if (board[3][8] != 0)
    		box36.setText(Integer.toString(board[3][8]));
    	else
    		box36.setText("");


    	if (board[4][0] != 0)
    		box37.setText(Integer.toString(board[4][0]));
    	else
    		box37.setText("");
    	if (board[4][1] != 0)
    		box38.setText(Integer.toString(board[4][1]));
    	else
    		box38.setText("");
    	if (board[4][2] != 0)
    		box39.setText(Integer.toString(board[4][2]));
    	else
    		box39.setText("");
    	if (board[4][3] != 0)
    		box40.setText(Integer.toString(board[4][3]));
    	else
    		box40.setText("");
    	if (board[4][4] != 0)
    		box41.setText(Integer.toString(board[4][4]));
    	else
    		box41.setText("");
    	if (board[4][5] != 0)
    		box42.setText(Integer.toString(board[4][5]));
    	else
    		box42.setText("");
    	if (board[4][6] != 0)
    		box43.setText(Integer.toString(board[4][6]));
    	else
    		box43.setText("");
    	if (board[4][7] != 0)
    		box44.setText(Integer.toString(board[4][7]));
    	else
    		box44.setText("");
    	if (board[4][8] != 0)
    		box45.setText(Integer.toString(board[4][8]));
    	else
    		box45.setText("");
    	

    	if (board[5][0] != 0)
    		box46.setText(Integer.toString(board[5][0]));
    	else
    		box46.setText("");
    	if (board[5][1] != 0)
    		box47.setText(Integer.toString(board[5][1]));
    	else
    		box47.setText("");
    	if (board[5][2] != 0)
    		box48.setText(Integer.toString(board[5][2]));
    	else
    		box48.setText("");
    	if (board[5][3] != 0)
    		box49.setText(Integer.toString(board[5][3]));
    	else
    		box49.setText("");
    	if (board[5][4] != 0)
    		box50.setText(Integer.toString(board[5][4]));
    	else
    		box50.setText("");
    	if (board[5][5] != 0)
    		box51.setText(Integer.toString(board[5][5]));
    	else
    		box51.setText("");
    	if (board[5][6] != 0)
    		box52.setText(Integer.toString(board[5][6]));
    	else
    		box52.setText("");
    	if (board[5][7] != 0)
    		box53.setText(Integer.toString(board[5][7]));
    	else
    		box53.setText("");
    	if (board[5][8] != 0)
    		box54.setText(Integer.toString(board[5][8]));
    	else 
    		box54.setText("");
    	

    	if (board[6][0] != 0)
    		box55.setText(Integer.toString(board[6][0]));
    	else
    		box55.setText("");
    	if (board[6][1] != 0)
    		box56.setText(Integer.toString(board[6][1]));
    	else
    		box56.setText("");
    	if (board[6][2] != 0)
    		box57.setText(Integer.toString(board[6][2]));
    	else
    		box57.setText("");
    	if (board[6][3] != 0)
    		box58.setText(Integer.toString(board[6][3]));
    	else
    		box58.setText("");
    	if (board[6][4] != 0)
    		box59.setText(Integer.toString(board[6][4]));
    	else
    		box59.setText("");
    	if (board[6][5] != 0)
    		box60.setText(Integer.toString(board[6][5]));
    	else
    		box60.setText("");
    	if (board[6][6] != 0)
    		box61.setText(Integer.toString(board[6][6]));
    	else
    		box61.setText("");
    	if (board[6][7] != 0)
    		box62.setText(Integer.toString(board[6][7]));
    	else
    		box62.setText("");
    	if (board[6][8] != 0)
    		box63.setText(Integer.toString(board[6][8]));
    	else
    		box63.setText("");


    	if (board[7][0] != 0)
    		box64.setText(Integer.toString(board[7][0]));
    	else
    		box64.setText("");
    	if (board[7][1] != 0)
    		box65.setText(Integer.toString(board[7][1]));
    	else
    		box65.setText("");
    	if (board[7][2] != 0)
    		box66.setText(Integer.toString(board[7][2]));
    	else
    		box66.setText("");
    	if (board[7][3] != 0)
    		box67.setText(Integer.toString(board[7][3]));
    	else
    		box67.setText("");
    	if (board[7][4] != 0)
    		box68.setText(Integer.toString(board[7][4]));
    	else
    		box68.setText("");
    	if (board[7][5] != 0)
    		box69.setText(Integer.toString(board[7][5]));
    	else
    		box69.setText("");
    	if (board[7][6] != 0)
    		box70.setText(Integer.toString(board[7][6]));
    	else
    		box70.setText("");
    	if (board[7][7] != 0)
    		box71.setText(Integer.toString(board[7][7]));
    	else
    		box71.setText("");
    	if (board[7][8] != 0)
    		box72.setText(Integer.toString(board[7][8]));
    	else
    		box72.setText("");
    	
    	
    	if (board[8][0] != 0)
    	box73.setText(Integer.toString(board[8][0]));
    	else
    		box73.setText("");
    	if (board[8][1] != 0)
    	box74.setText(Integer.toString(board[8][1]));
    	else
    		box74.setText("");
    	if (board[8][2] != 0)
    	box75.setText(Integer.toString(board[8][2]));
    	else
    		box75.setText("");
    	if (board[8][3] != 0)
    	box76.setText(Integer.toString(board[8][3]));
    	else
    		box76.setText("");
    	if (board[8][4] != 0)
    	box77.setText(Integer.toString(board[8][4]));
    	else
    		box77.setText("");
    	if (board[8][5] != 0)
    	box78.setText(Integer.toString(board[8][5]));
    	else
    		box78.setText("");
    	if (board[8][6] != 0)
    	box79.setText(Integer.toString(board[8][6]));
    	else
    		box79.setText("");
    	if (board[8][7] != 0)
    	box80.setText(Integer.toString(board[8][7]));
    	else
    		box80.setText("");
    	if (board[8][8] != 0)
    	box81.setText(Integer.toString(board[8][8]));
    	else
    		box81.setText("");
    	
    
    }

    @FXML
    void initialize() {

    }
}
