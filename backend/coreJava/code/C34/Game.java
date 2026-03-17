class Game{
    void createBoard(){
        for(int i = 1; i <= 9; i++){
            System.out.print(i + " ");
            if(i == 3 || i == 6) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        String player = "O";
        System.out.println("----- Welcome to Tic Tac Toe -----");
        Game game = new Game();
        System.out.println("Currently available blocks");
        game.createBoard();

        while(true){
            System.out.println(player + "'s turn.....");
        }
    }
}