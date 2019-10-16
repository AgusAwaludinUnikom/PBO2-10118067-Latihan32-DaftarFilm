/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan32.daftarfilm;

/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan daftar film yang sedang 
 * tayang
 */
public class PBO210118067Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        
        Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horror, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        film1.nowPlaying();
        
        film1.filmName = "Small Foot";
        film1.filmGenre = "Animation";
        film1.filmRating = 9.0;
        film1.filmDuration = 96;
        film1.nowPlaying();
        
        film1.filmName = "Crazy Rich Asian";
        film1.filmGenre = "Comedy";
        film1.filmRating = 7.8;
        film1.filmDuration = 119;
        film1.nowPlaying();
        
        film1.filmName = "Asih";
        film1.filmGenre = "Horror";
        film1.filmRating = 6.0;
        film1.filmDuration = 100;
        film1.nowPlaying();
    }
    
}
