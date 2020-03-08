# Configuration for ansible

## Supported environments/languages

* final image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_ansible | Blacklist filter for this tool | space-separated-list | ""
| SCA_ANSIBLE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_ANSIBLE_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_ANSIBLE_PLAYBOOKS | List of glob-expr to search for playbooks | space-separated-list | "*.yaml"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* ansible.ansible.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
