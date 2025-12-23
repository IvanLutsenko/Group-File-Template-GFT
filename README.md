# Group File Template – Community Edition

[![Version](https://img.shields.io/badge/Version-5.7.0-blue.svg)](https://github.com/IvanLutsenko/Group-File-Template-GFT/releases)
[![JetBrains Marketplace](https://img.shields.io/badge/JetBrains-Marketplace-blue.svg)](https://plugins.jetbrains.com/plugin/16836-architectural-templates)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

> **Community-maintained fork** of the original [Group File Template (GFT)](https://github.com/Louco11/Group-File-Template-GFT) plugin with extended compatibility for the latest Android Studio and IntelliJ IDEA versions.

## 🎯 Why Community Edition?

This fork focuses on **faster compatibility updates** with the latest IDE versions, especially Canary and Beta builds of Android Studio.

### Key Differences from Original

- ✅ **No upper IDE version restriction** - works with any IntelliJ Platform build 231+
- ✅ **Supports latest Android Studio Canary** - tested with Narwhal, Otter, Panda and newer
- ✅ **Regular updates** - community-driven maintenance
- ✅ **100% compatible** - all original features preserved

### Version Compatibility

| Version | Supported IDE Versions |
|---------|------------------------|
| 5.7.0+ (Community Edition) | IntelliJ Platform 231+ (unlimited) |
| 5.6 (Original) | IntelliJ Platform 231-253.* |

## 📦 Installation

### From JetBrains Marketplace (Recommended)

1. Open Settings/Preferences → Plugins
2. Search for "Group File Template – Community Edition"
3. Click Install
4. Restart IDE

### Manual Installation

Download the [latest release](https://github.com/IvanLutsenko/Group-File-Template-GFT/releases) and install from disk:

1. Settings/Preferences → Plugins
2. ⚙️ → Install Plugin from Disk...
3. Select the downloaded `.zip` file
4. Restart IDE

## 🚀 Quick Start

Plugin creates a group of files by custom templates from IDEA interface.

[See Templates Examples](https://github.com/IvanLutsenko/Group-File-Template-GFT/tree/master/templates)

### Short Templates

Create code snippets that can be quickly inserted anywhere.

**To create:**
1. `Tools` → `GFT Creator` → `Create New Short Template`
2. Highlight code in editor
3. Right-click → `Add in Template`

**To use:**
- Right-click in editor → `Create From Template`
- Or use Generate menu (Alt+Insert / Cmd+N)

### File Templates

Create groups of files with related structure (like feature modules, MVVM patterns, etc.).

**To create:**
1. `Tools` → `GFT Creator` → `Create New Template`
2. Enter template name
3. Configure `Main.json` structure

**To use:**
- Right-click on directory → `Templates` → Select your template

## 📖 Documentation

For detailed usage instructions, see the original plugin documentation:

- [Medium Articles](https://medium.com/@Doronec)
- [Habr Articles](https://habr.com/ru/companies/cian/articles/740928/)
- [Full Documentation](https://github.com/Louco11/Group-File-Template-GFT)

### Template Structure

Templates use JSON configuration with variable substitution:

**Parameters:**
- `{param}[-s]` - snake_case
- `{param}[-C]` - CamelCase
- `{param}[-c]` - camelCase
- `{package}` - Java/Kotlin package
- `{time}`, `{day}`, `{month}`, `{year}` - timestamps

**File Structure:**
```json
{
  "name": "Feature Template",
  "description": "Creates MVVM feature structure",
  "param": ["FeatureName"],
  "addFile": [
    {
      "name": "{FeatureName}[-C]Fragment.kt",
      "path": "ui/{FeatureName}[-s]",
      "fileTemplatePath": "Fragment.kt.tm"
    }
  ]
}
```

## 🔧 Development

### Building from Source

```bash
git clone https://github.com/IvanLutsenko/Group-File-Template-GFT.git
cd Group-File-Template-GFT
./gradlew buildPlugin
```

Plugin will be in `build/distributions/`.

### Publishing

```bash
export JETBRAINS_TOKEN=your_token
./gradlew publishPlugin
```

## 🤝 Contributing

Contributions are welcome! This is a community-maintained fork.

**Ways to contribute:**
- Report bugs via [Issues](https://github.com/IvanLutsenko/Group-File-Template-GFT/issues)
- Submit Pull Requests with fixes
- Share your templates in Discussions
- Help update documentation

## 📜 Credits

- **Original Author:** [Mikhail Dorontsov (Louco11)](https://github.com/Louco11)
- **Original Repository:** [Group-File-Template-GFT](https://github.com/Louco11/Group-File-Template-GFT)
- **Community Maintainer:** [Ivan Lutsenko](https://github.com/IvanLutsenko)

## 📄 License

```
Copyright 2021 Doroncov Mihail
Copyright 2025 Ivan Lutsenko (Community Edition)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

---

**⭐ If this fork helps you, please star the repository!**

**🔗 Links:**
- [JetBrains Marketplace](https://plugins.jetbrains.com/) (after publication)
- [Original Plugin](https://plugins.jetbrains.com/plugin/16836-architectural-templates)
- [Report Issues](https://github.com/IvanLutsenko/Group-File-Template-GFT/issues)
