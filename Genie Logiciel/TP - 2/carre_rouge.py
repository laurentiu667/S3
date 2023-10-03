from tkinter import *
import random

class Carre():
    def __init__(self):
        self.largeur = 25
        self.hauteur = 25
        self.couleur = "red"

class Vue():
    def __init__(self, parent, modele):
        self.vue = parent
        self.modele = modele
        self.root = Tk()
        self.creer_page_jeu()
        self.canvas.bind("<B1-Motion>", self.deplacer_carre)

    def afficher_demarrage(self):
        self.cadre_jeu.pack()

    def creer_page_jeu(self):
        self.cadre_jeu = Frame(self.root)
        self.canvas = Canvas(self.cadre_jeu,
                             width=self.modele.largeur,
                             height=self.modele.hauteur,
                             bg="pink")
        self.canvas.pack()

    def afficher_carre_rouge(self):
        self.canvas.create_rectangle(self.modele.carre.largeur, 
                                     self.modele.carre.hauteur, 
                                     self.modele.carre.largeur + (self.modele.carre.largeur * 2),
                                     self.modele.carre.hauteur + (self.modele.carre.hauteur * 2),
                                     fill=self.modele.carre.couleur,
                                     tags="carre_rouge")

    def deplacer_carre(self, event=None):
        self.canvas.delete(ALL)
        if event:
            self.canvas.create_rectangle(event.x - self.modele.carre.largeur,
                                         event.y - self.modele.carre.hauteur,
                                         event.x + self.modele.carre.largeur,
                                         event.y + self.modele.carre.hauteur,
                                         fill=self.modele.carre.couleur)

class Modele():
    def __init__(self, parent):
        self.modele = parent # controleur
        self.largeur = 800
        self.hauteur = 1200
        self.carre = Carre()

class Controleur():
    def __init__(self): # sert à ajouter des attributs à l'objet
        self.modele = Modele(self)
        self.vue = Vue(self, self.modele)
        self.vue.afficher_demarrage()
        self.vue.afficher_carre_rouge()
        self.vue.root.mainloop()

if __name__ == '__main__':
    c = Controleur()