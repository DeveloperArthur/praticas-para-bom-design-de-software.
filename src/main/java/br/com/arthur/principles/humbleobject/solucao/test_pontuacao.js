import { calcularPontuacao } from "./pontuacao";

function testValidValues() {
    const result = calcularPontuacao(5, 6, 7, 8, 9);
    assert("Valid values - total1", 102.5, result.total1);
    assert("Valid values - total2", 69.5, result.total2);
}

function testAllValuesZero() {
    try {
        calcularPontuacao(0, 0, 0, 0, 0);
        console.error("Test for all values equal to zero failed.");
    } catch (error) {
        assert("All values equal to zero", "Values need to be greater than zero", error.message);
    }
}

function testNegativeValueMesCargo() {
    try {
        calcularPontuacao(-1, 6, 7, 8, 9);
        console.error("Test for negative value (mes_cargo) failed.");
    } catch (error) {
        assert("Negative value (mes_cargo)", "Values need to be greater than zero", error.message);
    }
}

function testNegativeValueMesLotacao() {
    try {
        calcularPontuacao(5, -1, 7, 8, 9);
        console.error("Test for negative value (mes_lotacao) failed.");
    } catch (error) {
        assert("Negative value (mes_lotacao)", "Values need to be greater than zero", error.message);
    }
}

function testNegativeValueMesAdjunto() {
    try {
        calcularPontuacao(5, 6, -1, 8, 9);
        console.error("Test for negative value (mes_adjunto) failed.");
    } catch (error) {
        assert("Negative value (mes_adjunto)", "Values need to be greater than zero", error.message);
    }
}

function testNegativeValueMesTitular() {
    try {
        calcularPontuacao(5, 6, 7, -1, 9);
        console.error("Test for negative value (mes_titular) failed.");
    } catch (error) {
        assert("Negative value (mes_titular)", "Values need to be greater than zero", error.message);
    }
}

function testNegativeValueMagisterio() {
    try {
        calcularPontuacao(5, 6, 7, 8, -1);
        console.error("Test for negative value (magisterio) failed.");
    } catch (error) {
        assert("Negative value (magisterio)", "Values need to be greater than zero", error.message);
    }
}

function assert(description, expected, actual) {
    if (expected === actual) {
        console.log(`Test '${description}' passed.`);
    } else {
        console.error(`Test '${description}' failed. Expected result: ${expected}, Actual result: ${actual}`);
    }
}

function runTests() {
    testValidValues();
    testAllValuesZero();
    testNegativeValueMesCargo();
    testNegativeValueMesLotacao();
    testNegativeValueMesAdjunto();
    testNegativeValueMesTitular();
    testNegativeValueMagisterio();
}

runTests();