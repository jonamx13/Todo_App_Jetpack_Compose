package com.jonamx13.todoapp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.jonamx13.ui.theme.AppTypography
import com.jonamx13.ui.theme.backgroundDark
import com.jonamx13.ui.theme.backgroundLight
import com.jonamx13.ui.theme.errorContainerDark
import com.jonamx13.ui.theme.errorContainerLight
import com.jonamx13.ui.theme.errorDark
import com.jonamx13.ui.theme.errorLight
import com.jonamx13.ui.theme.inverseOnSurfaceDark
import com.jonamx13.ui.theme.inverseOnSurfaceLight
import com.jonamx13.ui.theme.inversePrimaryDark
import com.jonamx13.ui.theme.inversePrimaryLight
import com.jonamx13.ui.theme.inverseSurfaceDark
import com.jonamx13.ui.theme.inverseSurfaceLight
import com.jonamx13.ui.theme.onBackgroundDark
import com.jonamx13.ui.theme.onBackgroundLight
import com.jonamx13.ui.theme.onErrorContainerDark
import com.jonamx13.ui.theme.onErrorContainerLight
import com.jonamx13.ui.theme.onErrorDark
import com.jonamx13.ui.theme.onErrorLight
import com.jonamx13.ui.theme.onPrimaryContainerDark
import com.jonamx13.ui.theme.onPrimaryContainerLight
import com.jonamx13.ui.theme.onPrimaryDark
import com.jonamx13.ui.theme.onPrimaryLight
import com.jonamx13.ui.theme.onSecondaryContainerDark
import com.jonamx13.ui.theme.onSecondaryContainerLight
import com.jonamx13.ui.theme.onSecondaryDark
import com.jonamx13.ui.theme.onSecondaryLight
import com.jonamx13.ui.theme.onSurfaceDark
import com.jonamx13.ui.theme.onSurfaceLight
import com.jonamx13.ui.theme.onSurfaceVariantDark
import com.jonamx13.ui.theme.onSurfaceVariantLight
import com.jonamx13.ui.theme.onTertiaryContainerDark
import com.jonamx13.ui.theme.onTertiaryContainerLight
import com.jonamx13.ui.theme.onTertiaryDark
import com.jonamx13.ui.theme.onTertiaryLight
import com.jonamx13.ui.theme.outlineDark
import com.jonamx13.ui.theme.outlineLight
import com.jonamx13.ui.theme.outlineVariantDark
import com.jonamx13.ui.theme.outlineVariantLight
import com.jonamx13.ui.theme.primaryContainerDark
import com.jonamx13.ui.theme.primaryContainerLight
import com.jonamx13.ui.theme.primaryDark
import com.jonamx13.ui.theme.primaryLight
import com.jonamx13.ui.theme.scrimDark
import com.jonamx13.ui.theme.scrimLight
import com.jonamx13.ui.theme.secondaryContainerDark
import com.jonamx13.ui.theme.secondaryContainerLight
import com.jonamx13.ui.theme.secondaryDark
import com.jonamx13.ui.theme.secondaryLight
import com.jonamx13.ui.theme.surfaceBrightDark
import com.jonamx13.ui.theme.surfaceBrightLight
import com.jonamx13.ui.theme.surfaceContainerDark
import com.jonamx13.ui.theme.surfaceContainerHighDark
import com.jonamx13.ui.theme.surfaceContainerHighLight
import com.jonamx13.ui.theme.surfaceContainerHighestDark
import com.jonamx13.ui.theme.surfaceContainerHighestLight
import com.jonamx13.ui.theme.surfaceContainerLight
import com.jonamx13.ui.theme.surfaceContainerLowDark
import com.jonamx13.ui.theme.surfaceContainerLowLight
import com.jonamx13.ui.theme.surfaceContainerLowestDark
import com.jonamx13.ui.theme.surfaceContainerLowestLight
import com.jonamx13.ui.theme.surfaceDark
import com.jonamx13.ui.theme.surfaceDimDark
import com.jonamx13.ui.theme.surfaceDimLight
import com.jonamx13.ui.theme.surfaceLight
import com.jonamx13.ui.theme.surfaceVariantDark
import com.jonamx13.ui.theme.surfaceVariantLight
import com.jonamx13.ui.theme.tertiaryContainerDark
import com.jonamx13.ui.theme.tertiaryContainerLight
import com.jonamx13.ui.theme.tertiaryDark
import com.jonamx13.ui.theme.tertiaryLight


private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun TodoAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

