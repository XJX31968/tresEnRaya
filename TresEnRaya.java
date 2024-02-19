package tresEnRaya;

public class TresEnRaya {

	private int datos[][];
	private int orden;
	
	
	public TresEnRaya() {
		
		datos = new int[6][6];
	}
	
	
	public void imprimir() {

		for(int i=0;i<orden;i++) {
			for(int j=0;j<orden;j++) {
				
				if(datos[i][j]<10) {
					System.out.print("0");
				}
				System.out.print(datos[i][j]+" ");
			}
			System.out.println();
		}		
	}	
	
	
	
	
	
	public void llenarTablero() {
		
		int turno=0;
		
		while (turno<6) {
			
			for(int x=turno;x==turno;x++) {
				
				int fila = (int) (Math.random()*5+1);;
				int columna = (int) (Math.random()*5+1);

				
				datos[fila][columna] = 5;
				
			}
			
			
			
			for(int o=turno;o==turno;o++) {
				
				int fila = (int) (Math.random()*5+1);;
				int columna = (int) (Math.random()*5+1);

				
				datos[fila][columna] = 0;
				
				
			}
			
			turno++; 
			
		}
		
	}
	
	
	
	
}
