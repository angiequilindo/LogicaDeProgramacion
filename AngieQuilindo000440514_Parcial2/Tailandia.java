public class Tailandia{
	public static void main(String[] args) {
		
		String matriz[][];
		matriz = new String[6][9];

		for (int i=0;i<1 ;i++ ){
		 for (int j=0;j<matriz[0].length;j++ ){
		 		matriz[i][j] = "first";
		 }
		 	
		}
		 
		for(int i=1; i<2; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]="second";
            }
        }
        
        for(int i=2; i<4; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]="third";
            }
        }
		 
		for(int i=4; i<5; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]="fourth";
            }
        }

        for(int i=5; i<6; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]="fifth";
            }
        }



		 for (int i=0;i<matriz.length ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		
		 		if(matriz[i][j]=="first")
		 		{
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=="second")
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=="third")
		 		{
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=="fourth") 
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=="fifth")
		 		{
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"*");
		 		}

		 		System.out.println(ConsoleColors.RESET);
			}
			System.out.println();
		}
	}
}