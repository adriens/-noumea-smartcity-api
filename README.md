[![Build Status](https://travis-ci.org/adriens/noumea-smartcity-api.svg?branch=master)](https://travis-ci.org/adriens/noumea-smartcity-api)

# noumea-smartcity-api

Hub d'APIs REST pour la ville de Nouméa.

Déployée sur Heroku : `https://noumea-smartcity.herokuapp.com`


## Scalair Endpoints

`/scalair` : renvoie la liste des IGA live de tous les spots de Noméa, tel
que présenté sur [la carte de leur site](http://www.scalair.nc/)
`/scalair/logicoop` : uniquement Logicoop
`/scalair/logicoop/message` : endpoint [dédié au shield.io](https://shields.io/endpoint)
`/scalair/montravel`
`/scalair/montravel/message`
`/scalair/faubourg`
`/scalair/faubourg/message`
`/scalair/vata`
`/scalair/vata/message`
`/scalair/general` : IQA général pour Nouméa entier
`/scalair/general/message` ou `/scalair/message`
`/scalair/iga` : liste des IGA
`/scalair/iga/{indice}` : détail

