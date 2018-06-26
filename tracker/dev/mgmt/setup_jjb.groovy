@Library('trackerLibrary') _

runAnsiblePlaybookPipeline(
  PLAYBOOK:             'setup_jjb',
#  CREDENTIALS_ID:       'slave_rsa',
#  VAULT_CREDENTIALS_ID: 'tracker_read',
  OWNER:                'tracker',
  ENV:                  'dev',
  PLATFORM:             'mgmt',
  BRANCH:               'master'
)
