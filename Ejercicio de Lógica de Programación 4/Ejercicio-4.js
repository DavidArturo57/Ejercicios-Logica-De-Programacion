function gen_fibonacci() {
    //Pide ingreso de un numero
    let numero_fibonacci = prompt("Ingresa un numero:");
    numero_fibonacci = parseInt(numero_fibonacci);
    if(isNaN(numero_fibonacci)) {
        alert("Ingresa valor correcto");
        gen_fibonacci();
    }else {
        //Realiza serie fibonacci
        let fibonacci = [];
        //ciclo if primer numero de la serie fibonacci    
        if (numero_fibonacci > 0) fibonacci.push(0); 
         //ciclo if segundo numero de la serie fibonacci
        if (numero_fibonacci > 1) fibonacci.push(1);

        for(let i =2; i < numero_fibonacci; i++) {
            let newfibonacci = fibonacci[i - 1] + fibonacci[i - 2];
            fibonacci.push(newfibonacci);
        }

        //Imprime resultado
        document.body.innerHTML = `
          <p>El numero ingresado es: ${numero_fibonacci}</p>
          <p>Serie fibonacci: ${fibonacci.join(",")}</p>
        `;
    }
}

//Realiza ejecucion de la funcion
gen_fibonacci();