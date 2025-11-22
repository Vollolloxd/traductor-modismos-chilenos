# Traductor de Modismos Chilenos 🇨🇱

**App Android para traducir modismos chilenos al español neutro internacional.**

## 📱 Descripción

Esta aplicación Android permite a usuarios chilenos y extranjeros entender modismos, expresiones y jerga común de Chile. La app traduce frases con modismos al español neutro, proporciona ejemplos de uso y pronunciación en audio.

## ✨ Características

- 🔍 **Buscador inteligente**: Encuentra modismos rápidamente
- 🎯 **Traductor de frases**: Escribe una frase y detecta automáticamente los modismos
- 🔊 **Pronunciación en audio**: Escucha cómo se pronuncian los modismos
- 📚 **Ejemplos contextualizados**: Ve frases de ejemplo para cada modismo
- ⭐ **Modismo del día**: Aprende uno nuevo cada día
- 🎮 **Mini-retos**: Desafíos para practicar tu comprensión
- 🤝 **Comunidad**: Usuarios pueden sugerir nuevos modismos
- 📊 **Historial**: Guarda tus búsquedas favoritas

## 🛠️ Stack Tecnológico

- **Lenguaje**: Kotlin
- **UI Framework**: Jetpack Compose
- **Arquitectura**: MVVM + Clean Architecture
- **Base de datos**: Room Database
- **Networking**: Retrofit (para futuras APIs)
- **Audio**: Text-to-Speech (TTS)
- **Testing**: JUnit, Espresso

## 📋 Datos

La app incluye **100+ modismos chilenos** con:
- Definición clara
- Ejemplo de uso
- Traducción al español neutro
- Pronunciación en audio

## 🚀 Cómo Comenzar

### Requisitos
- Android Studio Flamingo o superior
- JDK 11+
- Gradle 8.0+

### Instalación

```bash
# 1. Clona el repositorio
git clone https://github.com/Vollolloxd/traductor-modismos-chilenos.git

# 2. Abre el proyecto en Android Studio
cd traductor-modismos-chilenos

# 3. Sincroniza las dependencias
# (Android Studio lo hará automáticamente)

# 4. Ejecuta en un emulador o dispositivo
```

## 📁 Estructura del Proyecto

```
traductor-modismos-chilenos/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/traductor/modismos/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── screens/
│   │   │   │   │   ├── components/
│   │   │   │   │   └── theme/
│   │   │   │   ├── viewmodel/
│   │   │   │   ├── model/
│   │   │   │   ├── data/
│   │   │   │   │   ├── local/
│   │   │   │   │   └── repository/
│   │   │   │   └── utils/
│   │   │   ├── res/
│   │   │   │   ├── values/
│   │   │   │   ├── drawable/
│   │   │   │   ├── layout/
│   │   │   │   └── raw/ (datos JSON)
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── .gitignore
└── README.md
```

## 🎯 Próximas Características

- [ ] Sincronización en la nube (Firebase)
- [ ] Traducción a otros idiomas
- [ ] API REST para contribuciones de la comunidad
- [ ] Widget de modismo del día
- [ ] Juegos educativos
- [ ] Offline support mejorado

## 📖 Cómo Usar

### 1. **Buscar un modismo**
- Abre la pantalla de búsqueda
- Escribe el modismo (ej: "cachai")
- Toca en el resultado para ver detalles

### 2. **Traducir una frase**
- Ve a "Traductor"
- Escribe una frase en español chileno
- La app detectará los modismos automáticamente
- Toca en cada modismo para ver su explicación

### 3. **Escuchar pronunciación**
- Busca un modismo
- Haz tap en el botón de audio 🔊
- La app reproducirá la pronunciación

## 🤝 Contribuir

Las contribuciones son bienvenidas. Por favor:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📝 Base de Datos de Modismos

Los modismos se almacenan en `res/raw/modismos.json`. Cada entrada contiene:

```json
{
  "modismo": "cachai",
  "definicion": "¿Entiendes? / ¿Me explico?",
  "ejemplo": "Te cuento cómo llegar, ¿cachai?",
  "traduccion": "¿Entiendes?",
  "audioUrl": "https://tusitio.com/audio/cachai.mp3"
}
```

## 📄 Licencia

Este proyecto está bajo la licencia MIT. Ver `LICENSE` para más detalles.

## 👨‍💻 Autor

Desarrollado con ❤️ para ayudar a entender la cultura y lenguaje chileno.

## 📞 Contacto

Tienes preguntas o sugerencias? Abre un issue o contáctame en [@TuTwitter](https://twitter.com/tutwitter).

---

**¡Cachai bien la app! 🚀**
