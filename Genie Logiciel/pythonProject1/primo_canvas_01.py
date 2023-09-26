import random
from tkinter import *

class Vue():
    def __init__(self, parent, modele):
        self.parent = parent
        self.modele = modele
        self.root = Tk()
        self.canevas = Canvas(self.root,
                              width=self.modele.largeur,
                              height=self.modele.hauteur,
                              bg="Salmon")
        self.canevas.pack()

        self.creer_boules()

    def creer_boules(self):
        n = 12
        for i in range(12):
            x = random.randrange(self.modele.largeur)
            y = random.randrange(self.modele.hauteur)
            taille = int(random.randrange(20, 30) /2)
            self.canevas.create_oval(x + taille, y + taille, x - taille, y - taille, fill="red")


class Modele():
    def __init__(self, parent):
        self.parent = parent
        self.largeur = 800
        self.hauteur = 600

class Controlleur():
    def __init__(self):
        self.modele = Modele(self)
        self.vue = Vue(self, self.modele)

if __name__ == '__main__':
     c = Controlleur()
     c.vue.root.mainloop()
     print(c, c.modele, c.vue)
