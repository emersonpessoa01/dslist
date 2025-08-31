package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

//Anotação - REpresenta o encpasulando dois atrbutos em uma classe
//Classe auxiliar para representar a chave primaria composta
@Embeddable
public class BelongingPK {
    @ManyToOne
    @Column(name = "game_id")
    private  Game game;

    @ManyToOne
    @Column(name = "list_id")
    private GameList list;

    public BelongingPK() {
    }
    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }
    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public GameList getList() {
        return list;
    }
    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
