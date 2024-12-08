function calc_factorial(){
    //Ingresar numero el usuario
    let num = prompt("Introduce un numero");
    num = parseInt(num)
    if(isNaN(num)||num <0) {
        alert("!!Introduce un numero positivo!!");
        calc_factorial();
    }else{
        //Realiza el calculo factorial
        let factorial = 1;
        for (let i = 1; i<=num; i++){
            factorial = factorial + (factorial * (i - 1));
        }

        //imprime los resultados
        document.body.innerHTML = `
          <p>El factorial de ${num} es: ${factorial}</p>
        `;
    }
}

//Realiza ejecucion de la funcion
calc_factorial();