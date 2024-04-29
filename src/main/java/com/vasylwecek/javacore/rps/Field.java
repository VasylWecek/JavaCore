package rps;

public class Field {
    String playerChoice;
    String computerChoice;


    Field(){
        this.playerChoice = " ";
        this.computerChoice = " ";
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }



}
