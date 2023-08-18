# Système de Gestion de Zoo
Au sein de notre zoo, cohabitent une diversité d'animaux. Ces créatures embrassent une gamme de types allant des mammifères aux oiseaux en passant par les reptiles et plus encore.

Dans le cadre de cet exercice, notre objectif est de promouvoir des interactions distinctes entre ces animaux en fonction de leurs types respectifs.

## 1. Classe Abstraite : Animal
La base de notre hiérarchie animale est établie à travers la classe abstraite "Animal," exploitant la puissance de l'héritage. Cette classe est caractérisée par son nom et une méthode appelée "parler," qui exhibera des variations selon les différents types d'animaux.

## 2. Types d'Animaux
Tout en adoptant un certain degré d'abstraction, nous catégorisons nos animaux en trois types : les chats, les chiens et les oiseaux.

### 2.1 Le Chat
Nous présentons la classe "Chat," héritant de la classe "Animal." La méthode "parler" pour le chat retourne le son "le chat miaule."

### 2.2 Le Chien
Intégrant la classe "Chien," également héritée de "Animal," la méthode "parler" pour les chiens résonne par "le chien aboie."

### 2.3 L'Oiseau
La classe "Oiseau," une extension de la classe "Animal," utilise la méthode "parler" pour émettre la mélodieuse phrase "l'oiseau chante."

## 3. L'Écosystème du Zoo
Notre vision d'un zoo se matérialise à travers le concept d'un écosystème intégré pour ces animaux.

Ce zoo conceptuel présente des fonctions vitales, telles que l'ajout d'animaux et l'orchestration d'un discours collectif de tous les animaux à l'intérieur (avec la possibilité d'extensions futures, y compris des procédures de retrait d'animaux). Au cœur de cela, le zoo abrite une liste dynamique d'animaux.

## 4. Approche de Mise en Œuvre
Lors de l'initialisation d'un animal, la puissance du polymorphisme entre en jeu. Plus précisément, nous employons le polymorphisme de sous-type, tel qu'autorisé par l'héritage. Cette utilisation stratégique du polymorphisme est nécessitée par notre désir d'une liste complète d'animaux au sein du zoo. Compte tenu du fait que "Animal" est une classe abstraite, son instanciation directe est impossible.

En résumé, ce Système de Gestion de Zoo encapsule le monde complexe des animaux, leurs vocalisations uniques et leur coexistence harmonieuse au sein de l'environnement de zoo soigneusement structuré.
