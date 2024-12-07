function solicit_temperatura() {
    // EL usuario ingresa temperatura celsius
    let celsius = prompt("Introduce la temperatura en grados celcius(°C):");
    // Convierte en numero lo ingresado por el usuario
    celsius = parseFloat(celsius)
    //ciclo if determinar si es numero o no
    if (isNaN(celsius)) {
        alert("Por favor introducir un valor valido.")
        solicit_temperatura();
    } else {
        //Realiza Conversiones °f(fathrenheit) y °k(kelvin)
        const fathrenheit = (celsius * 9 / 5) + 32;
        const kelvin = celsius + 273.15;

        //Imprime reusltados conversiones
        document.body.innerHTML = `
        <p>Temperatura en celsius: ${celsius}°C</p>
        <p>Temperatura en fathrenheit: ${fathrenheit.toFixed(2)}°F</p>
        <p>Temperatura en kelvin: ${kelvin.toFixed(2)}°K</p>

        `;

    }
}

//Realiza ejecucion funcion
solicit_temperatura();
