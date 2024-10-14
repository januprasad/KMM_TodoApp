package com.github.todo.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.github.todo.presentation.screen.home.HomeScreen

private val lightScheme = lightColorScheme(
    primary = _root_ide_package_.com.github.todo.theme.primaryLight,
    onPrimary = _root_ide_package_.com.github.todo.theme.onPrimaryLight,
    primaryContainer = _root_ide_package_.com.github.todo.theme.primaryContainerLight,
    onPrimaryContainer = _root_ide_package_.com.github.todo.theme.onPrimaryContainerLight,
    secondary = _root_ide_package_.com.github.todo.theme.secondaryLight,
    onSecondary = _root_ide_package_.com.github.todo.theme.onSecondaryLight,
    secondaryContainer = _root_ide_package_.com.github.todo.theme.secondaryContainerLight,
    onSecondaryContainer = _root_ide_package_.com.github.todo.theme.onSecondaryContainerLight,
    tertiary = _root_ide_package_.com.github.todo.theme.tertiaryLight,
    onTertiary = _root_ide_package_.com.github.todo.theme.onTertiaryLight,
    tertiaryContainer = _root_ide_package_.com.github.todo.theme.tertiaryContainerLight,
    onTertiaryContainer = _root_ide_package_.com.github.todo.theme.onTertiaryContainerLight,
    error = _root_ide_package_.com.github.todo.theme.errorLight,
    onError = _root_ide_package_.com.github.todo.theme.onErrorLight,
    errorContainer = _root_ide_package_.com.github.todo.theme.errorContainerLight,
    onErrorContainer = _root_ide_package_.com.github.todo.theme.onErrorContainerLight,
    background = _root_ide_package_.com.github.todo.theme.backgroundLight,
    onBackground = _root_ide_package_.com.github.todo.theme.onBackgroundLight,
    surface = _root_ide_package_.com.github.todo.theme.surfaceLight,
    onSurface = _root_ide_package_.com.github.todo.theme.onSurfaceLight,
    surfaceVariant = _root_ide_package_.com.github.todo.theme.surfaceVariantLight,
    onSurfaceVariant = _root_ide_package_.com.github.todo.theme.onSurfaceVariantLight,
    outline = _root_ide_package_.com.github.todo.theme.outlineLight,
    outlineVariant = _root_ide_package_.com.github.todo.theme.outlineVariantLight,
    scrim = _root_ide_package_.com.github.todo.theme.scrimLight,
    inverseSurface = _root_ide_package_.com.github.todo.theme.inverseSurfaceLight,
    inverseOnSurface = _root_ide_package_.com.github.todo.theme.inverseOnSurfaceLight,
    inversePrimary = _root_ide_package_.com.github.todo.theme.inversePrimaryLight,
    surfaceDim = _root_ide_package_.com.github.todo.theme.surfaceDimLight,
    surfaceBright = _root_ide_package_.com.github.todo.theme.surfaceBrightLight,
    surfaceContainerLowest = _root_ide_package_.com.github.todo.theme.surfaceContainerLowestLight,
    surfaceContainerLow = _root_ide_package_.com.github.todo.theme.surfaceContainerLowLight,
    surfaceContainer = _root_ide_package_.com.github.todo.theme.surfaceContainerLight,
    surfaceContainerHigh = _root_ide_package_.com.github.todo.theme.surfaceContainerHighLight,
    surfaceContainerHighest = _root_ide_package_.com.github.todo.theme.surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = _root_ide_package_.com.github.todo.theme.primaryDark,
    onPrimary = _root_ide_package_.com.github.todo.theme.onPrimaryDark,
    primaryContainer = _root_ide_package_.com.github.todo.theme.primaryContainerDark,
    onPrimaryContainer = _root_ide_package_.com.github.todo.theme.onPrimaryContainerDark,
    secondary = _root_ide_package_.com.github.todo.theme.secondaryDark,
    onSecondary = _root_ide_package_.com.github.todo.theme.onSecondaryDark,
    secondaryContainer = _root_ide_package_.com.github.todo.theme.secondaryContainerDark,
    onSecondaryContainer = _root_ide_package_.com.github.todo.theme.onSecondaryContainerDark,
    tertiary = _root_ide_package_.com.github.todo.theme.tertiaryDark,
    onTertiary = _root_ide_package_.com.github.todo.theme.onTertiaryDark,
    tertiaryContainer = _root_ide_package_.com.github.todo.theme.tertiaryContainerDark,
    onTertiaryContainer = _root_ide_package_.com.github.todo.theme.onTertiaryContainerDark,
    error = _root_ide_package_.com.github.todo.theme.errorDark,
    onError = _root_ide_package_.com.github.todo.theme.onErrorDark,
    errorContainer = _root_ide_package_.com.github.todo.theme.errorContainerDark,
    onErrorContainer = _root_ide_package_.com.github.todo.theme.onErrorContainerDark,
    background = _root_ide_package_.com.github.todo.theme.backgroundDark,
    onBackground = _root_ide_package_.com.github.todo.theme.onBackgroundDark,
    surface = _root_ide_package_.com.github.todo.theme.surfaceDark,
    onSurface = _root_ide_package_.com.github.todo.theme.onSurfaceDark,
    surfaceVariant = _root_ide_package_.com.github.todo.theme.surfaceVariantDark,
    onSurfaceVariant = _root_ide_package_.com.github.todo.theme.onSurfaceVariantDark,
    outline = _root_ide_package_.com.github.todo.theme.outlineDark,
    outlineVariant = _root_ide_package_.com.github.todo.theme.outlineVariantDark,
    scrim = _root_ide_package_.com.github.todo.theme.scrimDark,
    inverseSurface = _root_ide_package_.com.github.todo.theme.inverseSurfaceDark,
    inverseOnSurface = _root_ide_package_.com.github.todo.theme.inverseOnSurfaceDark,
    inversePrimary = _root_ide_package_.com.github.todo.theme.inversePrimaryDark,
    surfaceDim = _root_ide_package_.com.github.todo.theme.surfaceDimDark,
    surfaceBright = _root_ide_package_.com.github.todo.theme.surfaceBrightDark,
    surfaceContainerLowest = _root_ide_package_.com.github.todo.theme.surfaceContainerLowestDark,
    surfaceContainerLow = _root_ide_package_.com.github.todo.theme.surfaceContainerLowDark,
    surfaceContainer = _root_ide_package_.com.github.todo.theme.surfaceContainerDark,
    surfaceContainerHigh = _root_ide_package_.com.github.todo.theme.surfaceContainerHighDark,
    surfaceContainerHighest = _root_ide_package_.com.github.todo.theme.surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = _root_ide_package_.com.github.todo.theme.primaryLightMediumContrast,
    onPrimary = _root_ide_package_.com.github.todo.theme.onPrimaryLightMediumContrast,
    primaryContainer = _root_ide_package_.com.github.todo.theme.primaryContainerLightMediumContrast,
    onPrimaryContainer = _root_ide_package_.com.github.todo.theme.onPrimaryContainerLightMediumContrast,
    secondary = _root_ide_package_.com.github.todo.theme.secondaryLightMediumContrast,
    onSecondary = _root_ide_package_.com.github.todo.theme.onSecondaryLightMediumContrast,
    secondaryContainer = _root_ide_package_.com.github.todo.theme.secondaryContainerLightMediumContrast,
    onSecondaryContainer = _root_ide_package_.com.github.todo.theme.onSecondaryContainerLightMediumContrast,
    tertiary = _root_ide_package_.com.github.todo.theme.tertiaryLightMediumContrast,
    onTertiary = _root_ide_package_.com.github.todo.theme.onTertiaryLightMediumContrast,
    tertiaryContainer = _root_ide_package_.com.github.todo.theme.tertiaryContainerLightMediumContrast,
    onTertiaryContainer = _root_ide_package_.com.github.todo.theme.onTertiaryContainerLightMediumContrast,
    error = _root_ide_package_.com.github.todo.theme.errorLightMediumContrast,
    onError = _root_ide_package_.com.github.todo.theme.onErrorLightMediumContrast,
    errorContainer = _root_ide_package_.com.github.todo.theme.errorContainerLightMediumContrast,
    onErrorContainer = _root_ide_package_.com.github.todo.theme.onErrorContainerLightMediumContrast,
    background = _root_ide_package_.com.github.todo.theme.backgroundLightMediumContrast,
    onBackground = _root_ide_package_.com.github.todo.theme.onBackgroundLightMediumContrast,
    surface = _root_ide_package_.com.github.todo.theme.surfaceLightMediumContrast,
    onSurface = _root_ide_package_.com.github.todo.theme.onSurfaceLightMediumContrast,
    surfaceVariant = _root_ide_package_.com.github.todo.theme.surfaceVariantLightMediumContrast,
    onSurfaceVariant = _root_ide_package_.com.github.todo.theme.onSurfaceVariantLightMediumContrast,
    outline = _root_ide_package_.com.github.todo.theme.outlineLightMediumContrast,
    outlineVariant = _root_ide_package_.com.github.todo.theme.outlineVariantLightMediumContrast,
    scrim = _root_ide_package_.com.github.todo.theme.scrimLightMediumContrast,
    inverseSurface = _root_ide_package_.com.github.todo.theme.inverseSurfaceLightMediumContrast,
    inverseOnSurface = _root_ide_package_.com.github.todo.theme.inverseOnSurfaceLightMediumContrast,
    inversePrimary = _root_ide_package_.com.github.todo.theme.inversePrimaryLightMediumContrast,
    surfaceDim = _root_ide_package_.com.github.todo.theme.surfaceDimLightMediumContrast,
    surfaceBright = _root_ide_package_.com.github.todo.theme.surfaceBrightLightMediumContrast,
    surfaceContainerLowest = _root_ide_package_.com.github.todo.theme.surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = _root_ide_package_.com.github.todo.theme.surfaceContainerLowLightMediumContrast,
    surfaceContainer = _root_ide_package_.com.github.todo.theme.surfaceContainerLightMediumContrast,
    surfaceContainerHigh = _root_ide_package_.com.github.todo.theme.surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = _root_ide_package_.com.github.todo.theme.surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = _root_ide_package_.com.github.todo.theme.primaryLightHighContrast,
    onPrimary = _root_ide_package_.com.github.todo.theme.onPrimaryLightHighContrast,
    primaryContainer = _root_ide_package_.com.github.todo.theme.primaryContainerLightHighContrast,
    onPrimaryContainer = _root_ide_package_.com.github.todo.theme.onPrimaryContainerLightHighContrast,
    secondary = _root_ide_package_.com.github.todo.theme.secondaryLightHighContrast,
    onSecondary = _root_ide_package_.com.github.todo.theme.onSecondaryLightHighContrast,
    secondaryContainer = _root_ide_package_.com.github.todo.theme.secondaryContainerLightHighContrast,
    onSecondaryContainer = _root_ide_package_.com.github.todo.theme.onSecondaryContainerLightHighContrast,
    tertiary = _root_ide_package_.com.github.todo.theme.tertiaryLightHighContrast,
    onTertiary = _root_ide_package_.com.github.todo.theme.onTertiaryLightHighContrast,
    tertiaryContainer = _root_ide_package_.com.github.todo.theme.tertiaryContainerLightHighContrast,
    onTertiaryContainer = _root_ide_package_.com.github.todo.theme.onTertiaryContainerLightHighContrast,
    error = _root_ide_package_.com.github.todo.theme.errorLightHighContrast,
    onError = _root_ide_package_.com.github.todo.theme.onErrorLightHighContrast,
    errorContainer = _root_ide_package_.com.github.todo.theme.errorContainerLightHighContrast,
    onErrorContainer = _root_ide_package_.com.github.todo.theme.onErrorContainerLightHighContrast,
    background = _root_ide_package_.com.github.todo.theme.backgroundLightHighContrast,
    onBackground = _root_ide_package_.com.github.todo.theme.onBackgroundLightHighContrast,
    surface = _root_ide_package_.com.github.todo.theme.surfaceLightHighContrast,
    onSurface = _root_ide_package_.com.github.todo.theme.onSurfaceLightHighContrast,
    surfaceVariant = _root_ide_package_.com.github.todo.theme.surfaceVariantLightHighContrast,
    onSurfaceVariant = _root_ide_package_.com.github.todo.theme.onSurfaceVariantLightHighContrast,
    outline = _root_ide_package_.com.github.todo.theme.outlineLightHighContrast,
    outlineVariant = _root_ide_package_.com.github.todo.theme.outlineVariantLightHighContrast,
    scrim = _root_ide_package_.com.github.todo.theme.scrimLightHighContrast,
    inverseSurface = _root_ide_package_.com.github.todo.theme.inverseSurfaceLightHighContrast,
    inverseOnSurface = _root_ide_package_.com.github.todo.theme.inverseOnSurfaceLightHighContrast,
    inversePrimary = _root_ide_package_.com.github.todo.theme.inversePrimaryLightHighContrast,
    surfaceDim = _root_ide_package_.com.github.todo.theme.surfaceDimLightHighContrast,
    surfaceBright = _root_ide_package_.com.github.todo.theme.surfaceBrightLightHighContrast,
    surfaceContainerLowest = _root_ide_package_.com.github.todo.theme.surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = _root_ide_package_.com.github.todo.theme.surfaceContainerLowLightHighContrast,
    surfaceContainer = _root_ide_package_.com.github.todo.theme.surfaceContainerLightHighContrast,
    surfaceContainerHigh = _root_ide_package_.com.github.todo.theme.surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = _root_ide_package_.com.github.todo.theme.surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = _root_ide_package_.com.github.todo.theme.primaryDarkMediumContrast,
    onPrimary = _root_ide_package_.com.github.todo.theme.onPrimaryDarkMediumContrast,
    primaryContainer = _root_ide_package_.com.github.todo.theme.primaryContainerDarkMediumContrast,
    onPrimaryContainer = _root_ide_package_.com.github.todo.theme.onPrimaryContainerDarkMediumContrast,
    secondary = _root_ide_package_.com.github.todo.theme.secondaryDarkMediumContrast,
    onSecondary = _root_ide_package_.com.github.todo.theme.onSecondaryDarkMediumContrast,
    secondaryContainer = _root_ide_package_.com.github.todo.theme.secondaryContainerDarkMediumContrast,
    onSecondaryContainer = _root_ide_package_.com.github.todo.theme.onSecondaryContainerDarkMediumContrast,
    tertiary = _root_ide_package_.com.github.todo.theme.tertiaryDarkMediumContrast,
    onTertiary = _root_ide_package_.com.github.todo.theme.onTertiaryDarkMediumContrast,
    tertiaryContainer = _root_ide_package_.com.github.todo.theme.tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = _root_ide_package_.com.github.todo.theme.onTertiaryContainerDarkMediumContrast,
    error = _root_ide_package_.com.github.todo.theme.errorDarkMediumContrast,
    onError = _root_ide_package_.com.github.todo.theme.onErrorDarkMediumContrast,
    errorContainer = _root_ide_package_.com.github.todo.theme.errorContainerDarkMediumContrast,
    onErrorContainer = _root_ide_package_.com.github.todo.theme.onErrorContainerDarkMediumContrast,
    background = _root_ide_package_.com.github.todo.theme.backgroundDarkMediumContrast,
    onBackground = _root_ide_package_.com.github.todo.theme.onBackgroundDarkMediumContrast,
    surface = _root_ide_package_.com.github.todo.theme.surfaceDarkMediumContrast,
    onSurface = _root_ide_package_.com.github.todo.theme.onSurfaceDarkMediumContrast,
    surfaceVariant = _root_ide_package_.com.github.todo.theme.surfaceVariantDarkMediumContrast,
    onSurfaceVariant = _root_ide_package_.com.github.todo.theme.onSurfaceVariantDarkMediumContrast,
    outline = _root_ide_package_.com.github.todo.theme.outlineDarkMediumContrast,
    outlineVariant = _root_ide_package_.com.github.todo.theme.outlineVariantDarkMediumContrast,
    scrim = _root_ide_package_.com.github.todo.theme.scrimDarkMediumContrast,
    inverseSurface = _root_ide_package_.com.github.todo.theme.inverseSurfaceDarkMediumContrast,
    inverseOnSurface = _root_ide_package_.com.github.todo.theme.inverseOnSurfaceDarkMediumContrast,
    inversePrimary = _root_ide_package_.com.github.todo.theme.inversePrimaryDarkMediumContrast,
    surfaceDim = _root_ide_package_.com.github.todo.theme.surfaceDimDarkMediumContrast,
    surfaceBright = _root_ide_package_.com.github.todo.theme.surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = _root_ide_package_.com.github.todo.theme.surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = _root_ide_package_.com.github.todo.theme.surfaceContainerLowDarkMediumContrast,
    surfaceContainer = _root_ide_package_.com.github.todo.theme.surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = _root_ide_package_.com.github.todo.theme.surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = _root_ide_package_.com.github.todo.theme.surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = _root_ide_package_.com.github.todo.theme.primaryDarkHighContrast,
    onPrimary = _root_ide_package_.com.github.todo.theme.onPrimaryDarkHighContrast,
    primaryContainer = _root_ide_package_.com.github.todo.theme.primaryContainerDarkHighContrast,
    onPrimaryContainer = _root_ide_package_.com.github.todo.theme.onPrimaryContainerDarkHighContrast,
    secondary = _root_ide_package_.com.github.todo.theme.secondaryDarkHighContrast,
    onSecondary = _root_ide_package_.com.github.todo.theme.onSecondaryDarkHighContrast,
    secondaryContainer = _root_ide_package_.com.github.todo.theme.secondaryContainerDarkHighContrast,
    onSecondaryContainer = _root_ide_package_.com.github.todo.theme.onSecondaryContainerDarkHighContrast,
    tertiary = _root_ide_package_.com.github.todo.theme.tertiaryDarkHighContrast,
    onTertiary = _root_ide_package_.com.github.todo.theme.onTertiaryDarkHighContrast,
    tertiaryContainer = _root_ide_package_.com.github.todo.theme.tertiaryContainerDarkHighContrast,
    onTertiaryContainer = _root_ide_package_.com.github.todo.theme.onTertiaryContainerDarkHighContrast,
    error = _root_ide_package_.com.github.todo.theme.errorDarkHighContrast,
    onError = _root_ide_package_.com.github.todo.theme.onErrorDarkHighContrast,
    errorContainer = _root_ide_package_.com.github.todo.theme.errorContainerDarkHighContrast,
    onErrorContainer = _root_ide_package_.com.github.todo.theme.onErrorContainerDarkHighContrast,
    background = _root_ide_package_.com.github.todo.theme.backgroundDarkHighContrast,
    onBackground = _root_ide_package_.com.github.todo.theme.onBackgroundDarkHighContrast,
    surface = _root_ide_package_.com.github.todo.theme.surfaceDarkHighContrast,
    onSurface = _root_ide_package_.com.github.todo.theme.onSurfaceDarkHighContrast,
    surfaceVariant = _root_ide_package_.com.github.todo.theme.surfaceVariantDarkHighContrast,
    onSurfaceVariant = _root_ide_package_.com.github.todo.theme.onSurfaceVariantDarkHighContrast,
    outline = _root_ide_package_.com.github.todo.theme.outlineDarkHighContrast,
    outlineVariant = _root_ide_package_.com.github.todo.theme.outlineVariantDarkHighContrast,
    scrim = _root_ide_package_.com.github.todo.theme.scrimDarkHighContrast,
    inverseSurface = _root_ide_package_.com.github.todo.theme.inverseSurfaceDarkHighContrast,
    inverseOnSurface = _root_ide_package_.com.github.todo.theme.inverseOnSurfaceDarkHighContrast,
    inversePrimary = _root_ide_package_.com.github.todo.theme.inversePrimaryDarkHighContrast,
    surfaceDim = _root_ide_package_.com.github.todo.theme.surfaceDimDarkHighContrast,
    surfaceBright = _root_ide_package_.com.github.todo.theme.surfaceBrightDarkHighContrast,
    surfaceContainerLowest = _root_ide_package_.com.github.todo.theme.surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = _root_ide_package_.com.github.todo.theme.surfaceContainerLowDarkHighContrast,
    surfaceContainer = _root_ide_package_.com.github.todo.theme.surfaceContainerDarkHighContrast,
    surfaceContainerHigh = _root_ide_package_.com.github.todo.theme.surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = _root_ide_package_.com.github.todo.theme.surfaceContainerHighestDarkHighContrast,
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
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  /*val colorScheme = when {
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )*
  another approach shown below.
   */

    val colors by mutableStateOf(
        if(isSystemInDarkTheme()) darkScheme else lightScheme
    )
    MaterialTheme(colorScheme = colors){
       content()
    }

}

