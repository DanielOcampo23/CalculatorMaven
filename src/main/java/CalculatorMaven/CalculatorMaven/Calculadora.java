package CalculatorMaven.CalculatorMaven;

public class Calculadora {
	private boolean estadoFuncionalidad[];
	
	public Calculadora() {
		estadoFuncionalidad = new boolean[10];
		estadoFuncionalidad[0] = false;
		estadoFuncionalidad[1] = true;
		estadoFuncionalidad[2] = false;
		estadoFuncionalidad[3] = true;
		estadoFuncionalidad[4] = false;
		estadoFuncionalidad[5] = false;
		estadoFuncionalidad[6] = true;
		estadoFuncionalidad[7] = false;
		estadoFuncionalidad[8] = true;
		estadoFuncionalidad[9] = true;		
	}
	
	public long suma(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}

	public int resta(int a, int b) {
		return (a-b);
	}
	
	public long multiplicacion(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}
	
	public double division(int a, int b) {
		//TODO desarrollar funcionalidad
		return (b!=0)?(a/b):0;
		
	}
	
	public int modulo(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}
	
	public long exponente(int a, int b) {
		//TODO desarrollar funcionalidad		
		return 0;
	}
	
	public long factorial(int a) {
		int r=1;
		for(int i=1;i<=a;i++) {
			r*=i;
		}
		return r;
	}
	
	public boolean esPrimo(int a) {
		//TODO desarrollar funcionalidad
		return false;
	}
	
	public boolean esPar(int a) {
		boolena retorno=false;
		String first=a;
		first=first.trim();
		char[] arreglo=first.toCharArray();
		char last=arreglo[arreglo.length-1];
		if(last=='0') {
			retorno=true;
		}else if(last=='2') {
			retorno=true;
		}else if(last=='4') {
			retorno=true;
		}else if(last=='6') {
			retorno=true;
		}else if(last=='8') {
			retorno=true;
		}
		
		return retorno;
	}
	
	public boolean esImpar(int a) {
		//TODO desarrollar funcionalidad
		boolean s = false;
		
		if(a%2!=0){
            s=true;
       }
		return s;
	}

	public boolean[] getEstadoFuncionalidad() {
		return estadoFuncionalidad;
	}

	public void setEstadoFuncionalidad(boolean[] estadoFuncionalidad) {
		this.estadoFuncionalidad = estadoFuncionalidad;
	}
	
	
}
