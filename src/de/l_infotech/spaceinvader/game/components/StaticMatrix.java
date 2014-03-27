package de.l_infotech.spaceinvader.game.components;

import de.l_infotech.spaceinvader.game.SpaceEngine;

/**
 * This class contains some solid byte matrix
 * @author Ludwig Biermann
 * @version 1.0
 *
 */
public class StaticMatrix {

	// little hack to simple the code
	private static byte a = SpaceEngine.SHINE;
	
	
	// some test code
	//field[23][0] = a;
	//Arrays.fill(field, (byte) 0);	
//		y	geht nach ->			
/*				0																		23
	field = new byte[][]{
x	0		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
geht nach unten	{0, a, 0, a, 0, a, 0, a, 0, a, 0, a,   0, a, 0, a, 0, a, 0, a, 0, a, 0, a},
		{0, 0, a, 0, 0, a, a, a, 0, a, a, a,   0, a, a, a, 0, a, a, a, 0, a, a, a},
		{0, a, 0, a, 0, a, 0, a, 0, a, 0, a,   0, a, 0, a, 0, a, 0, a, 0, a, 0, a},
	4	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	5	{0, a, 0, a, 0, a, 0, a, 0, a, 0, a,   0, a, 0, a, 0, a, 0, a, 0, a, 0, a},
		{0, a, a, a, 0, a, a, a, 0, a, a, a,   0, a, a, a, 0, a, a, a, 0, 0, a, 0},
		{0, a, 0, a, 0, a, 0, a, 0, a, 0, a,   0, a, 0, a, 0, a, 0, a, 0, a, 0, a},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, a, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   a, a, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, a, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, a, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, a, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, a, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, a, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, a, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
23		{0, 0, 0, 0, 0, a, 0, a, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		1	2  3  4  5  6  7  8  9 10 11 12   13 14 15 16 17 18 19 20 21 22 23 24
=> Start Position x = 21; y = 6
			
		t   t  t  0  t  t  t  0  t  t  t  0   t  t  t   0  t  t  t  0 t  t  t  0
		
		6
	
	
*/	
	// a one on 12x12
	public static byte[][] one12 = new byte[][]{
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,a,a,0,0,0,0,0},
			{0,0,0,0,a,0,a,0,0,0,0,0},
			{0,0,0,a,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,a,a,a,a,a,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0}};

	// a two on 12x12
	public static byte[][] two12 = new byte[][]{
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,a,a,a,0,0,0,0},
			{0,0,0,0,a,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,0,0,a,0,0,0,0,0},
			{0,0,0,0,0,a,0,0,0,0,0,0},
			{0,0,0,0,a,0,0,0,0,0,0,0},
			{0,0,0,a,0,0,0,0,0,0,0,0},
			{0,0,0,a,a,a,a,a,a,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0}};

	// a three on 12x12
	public static byte[][] three12 = new byte[][]{
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,a,a,a,0,0,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,a,a,a,0,0,0,0,0},
			{0,0,0,0,a,a,a,a,0,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,0,0,0,a,0,0,0,0},
			{0,0,0,0,a,a,a,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0}};

	// a null on 12x12	
	public static byte[][] null12 = new byte[][]{
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,a,a,a,a,0,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,a,0,0,0,0,a,0,0,0},
			{0,0,0,0,a,a,a,a,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0}};
	

	// a game over on 24x24
	public static final byte[][] GAME_OVER = new byte[][]{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, a, a, a, 0, 0, 0, a, 0, 0, 0,   0, 0, a, 0, a, 0, 0, 0, a, a, a, 0},
		{0, a, 0, 0, 0, 0, 0, 0, a, 0, 0, 0,   0, 0, a, 0, a, 0, 0, 0, a, 0, 0, 0},
		{0, a, 0, 0, 0, 0, 0, a, 0, a, 0, 0,   0, a, 0, a, 0, a, 0, 0, a, 0, 0, 0},
		{0, a, 0, a, a, 0, 0, a, 0, a, 0, 0,   0, a, 0, a, 0, a, 0, 0, a, a, a, 0},
		{0, a, 0, 0, a, 0, a, a, a, a, a, 0,   0, a, 0, a, 0, a, 0, 0, a, 0, 0, 0},
		{0, a, 0, 0, a, 0, a, 0, 0, 0, a, 0,   0, a, 0, a, 0, a, 0, 0, a, 0, 0, 0},
		{0, 0, a, a, a, 0, a, 0, 0, 0, a, 0,   0, a, 0, a, 0, a, 0, 0, a, a, a, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, a, a, 0, 0, a, 0, 0, 0, a, 0,   0, a, a, a, 0, 0, a, a, 0, 0, a, 0},
		{0, 0, 0, 0, a, 0, a, 0, 0, 0, a, 0,   0, a, 0, 0, 0, 0, a, 0, a, 0, a, 0},
		{0, a, 0, 0, a, 0, 0, a, 0, a, 0, 0,   0, a, 0, 0, 0, 0, a, 0, a, 0, a, 0},
		{0, a, 0, 0, a, 0, 0, a, 0, a, 0, 0,   0, a, a, a, 0, 0, a, a, 0, 0, a, 0},
		{0, a, 0, 0, a, 0, 0, a, 0, a, 0, 0,   0, a, 0, 0, 0, 0, a, a, 0, 0, a, 0},
		{0, a, 0, 0, a, 0, 0, 0, a, 0, 0, 0,   0, a, 0, 0, 0, 0, a, 0, a, 0, 0, 0},
		{0, 0, a, a, 0, 0, 0, 0, a, 0, 0, 0,   0, a, a, a, 0, 0, a, 0, a, 0, a, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

	// player ship
	public static final byte[][] player_size3x3 = new byte[][]{
		{0,a,0},
		{0,a,0},
		{a,0,a}};

	// destroy grafik
	public static final byte[][] destroy_size3x3 = new byte[][]{
		{a,0,a},
		{0,a,0},
		{a,0,a}};
	
	// laser grafik
	public static final byte[][] laser_size1x2 = new byte[][]{
		{a},
		{a}};
	
	// enemy ship
	public static final byte[][] enemy_size3x3 = new byte[][]{
		{a,0,a},
		{a,a,a},
		{a,0,a}};

}