from tkinter import *

import random

class Vue():
    def __init__(self,parent,modele):
        self.parent = parent
        self.modele = modele
        self.root = Tk()
        self.creer_page_jeu()
        
    def creer_page_jeu(self):
        self.cadre_jeu = Frame(self.root)
        self.canevas = Canvas(self.cadre_jeu,
                              width=self.modele.largeur, 
                              height= self.modele.hauteur, 
                              bg = "pink")
        self.canevas.pack()
        
    def afficher_demarrage(self):
        self.cadre_jeu.pack()
        self.afficher_carrer_rouge(self.modele.carrer_rouge)
        
    def afficher_carrer_rouge(self, carrer_rouge):
        self.canevas.create_rectangle(carrer_rouge.x, carrer_rouge.y , carrer_rouge.x + 50, carrer_rouge.y + 50, fill= carrer_rouge.couleur)
    
class Carrer_rouge():
    def __init__(self, modele):
        self.modele = modele
        self.x = self.modele.largeur / 4
        self.y = self.modele.hauteur / 4
        self.couleur = "red"

class Modele():
    def __init__(self,parent):
        self.parent = parent
        self.hauteur = 800
        self.largeur = 1200
        self.carrer_rouge = Carrer_rouge(self)
        
class Controleur():
    def __init__(self):
        self.modele = Modele(self)
        self.vue = Vue(self,self.modele)
        self.vue.afficher_demarrage()
        self.vue.root.mainloop()

if __name__ == '__main__':
    c = Controleur()
