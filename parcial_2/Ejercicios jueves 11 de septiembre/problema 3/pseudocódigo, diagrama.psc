Proceso PatronesAsteriscos
    Definir n, i, j, estrellas, espacios Como Entero
	
    Escribir "Ingrese el valor de n: "
    Leer n
	
    Para i <- 1 Hasta n Con Paso 1 Hacer
        
        Para j <- 1 Hasta n Con Paso 1 Hacer
            Escribir Sin Saltar "* "
        FinPara
		
        Escribir Sin Saltar "    "  
		
        
        estrellas <- 2 * (n - i) + 1
        espacios <- i - 1
		
        Para j <- 1 Hasta espacios Con Paso 1 Hacer
            Escribir Sin Saltar " "
        FinPara
		
        Para j <- 1 Hasta estrellas Con Paso 1 Hacer
            Escribir Sin Saltar "*"
        FinPara
		
        Escribir Sin Saltar "    "  
		
        
        estrellas <- 2 * i - 1
        Para j <- 1 Hasta estrellas Con Paso 1 Hacer
            Escribir Sin Saltar "*"
        FinPara
		
        Escribir ""  
    FinPara
FinProceso
