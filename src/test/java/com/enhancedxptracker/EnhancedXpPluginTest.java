package com.enhancedxptracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EnhancedXpPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EnhancedXpTrackerPlugin.class);
		RuneLite.main(args);
	}
}