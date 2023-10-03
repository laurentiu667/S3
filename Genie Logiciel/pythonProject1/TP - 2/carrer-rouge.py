from tkinter import *
import random


class Vue():
    def __innit__(self, parent, modele):
        self.parent = parent
        self.modele = modele
        self.root = Tk()
        self.creer_page_jeux()

    def creer_page_jeux(self):
        self.cadre_jeu = Frame(self.root)
        self.canevas = Canvas(self.cadre_jeu, width=self.modele.largeur, height=self.modele.hauteur, bg="pink")
        self.canevas.pack()

    def afficher_demarrage():
        self.cadre_jeu.pack()

class Modele():
    def __innit__(self, parent):
        self.parent = parent
        self.largeur = 1200
        self.hauteur = 800


class Controler():
    def __innit__(self):
        self.modele = Modele(self)  # self parce que on doit faire une instance du modele, Controleur est le parent de Modele
        self.vue = Vue(self, self.modele)
        self.vue.afficher_demarrage()
        self.vue.root.mainloop()


if __name__ == "__main__":
    c = Controler()
