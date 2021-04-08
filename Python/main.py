from car import Car
from account import Account
from uberX import UberX
if __name__ == "__main__":
    print("Hello World")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))

    uberX = UberX("AMG543", Account("Juan Perez", "JPR123"), "Chevrolet" , "Aveo")
    print(vars(uberX))

