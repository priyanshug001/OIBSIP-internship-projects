function convertTemperature() {
    var temperature = document.getElementById("temperature").value;
    var unit = document.getElementById("unit").value;
    var result = document.getElementById("result");
    var convertedTemperature;

    if (isNaN(temperature)) {
        alert("Please enter a valid number for the temperature.");
        return;
    }

    if (unit === "celsius") {
        convertedTemperature = (parseFloat(temperature) * 9 / 5) + 32;
        result.innerHTML = temperature + " Celsius = " + convertedTemperature.toFixed(2) + " Fahrenheit";
    } else if (unit === "fahrenheit") {
        convertedTemperature = (parseFloat(temperature) - 32) * 5 / 9;
        result.innerHTML = temperature + " Fahrenheit = " + convertedTemperature.toFixed(2) + " Celsius";
    } else if (unit === "kelvin") {
        convertedTemperature = parseFloat(temperature) + 273.15;
        result.innerHTML = temperature + " Kelvin = " + convertedTemperature.toFixed(2) + " Celsius";
    }
}
