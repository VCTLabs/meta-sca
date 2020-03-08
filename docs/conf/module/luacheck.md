# Configuration for luacheck

## Supported environments/languages

* lua

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_luacheck | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_LUACHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_LUACHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* luacheck.luacheck.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
