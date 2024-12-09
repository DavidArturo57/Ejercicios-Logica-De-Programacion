function numero_secreto() {
    //Num aleatorio secreto entre  1 al 100
    const num_secret = Math.floor(Math.random() * 100) + 1;
    const intento = [];
    let adivina = false;
    
    //ciclo while para multiples intentos adivinar
    while(!adivina){
        let num = prompt("Adivina entre los numeros 1 al 100");
        if (!num || isNaN(num) || num < 1 || num > 100) {
            alert("Introduce un numero entre 1 al 100 valido");
            numero_secreto();
        }
        num = parseInt(num);
        //almacenar el intento
        intento.push(num);
        //ciclo if para verificar si el numero es correcto
        if(num == num_secret) {
             alert("!!Felicidades, adivinaste el número secreto.!!");
             document.body.innerHTML = `
             <p>Lista de numeros introducidos :${intento.join(",")}</p>;
            `;
            adivina = true;
        }else{
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
            
        }

    }
}
//Realiza ejecucion de la funcion
numero_secreto();