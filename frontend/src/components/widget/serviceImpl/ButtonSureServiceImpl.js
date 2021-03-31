import { WidgetService } from '../service/WidgetService'
const defaultOptions = {
  name: 'buttonSureWidget',
  icon: null,
  label: '确定',
  style: {
    width: 100,
    height: 34,
    borderWidth: '',
    borderColor: '',
    borderRadius: '',
    fontSize: 14,
    fontWeight: 500,
    lineHeight: '',
    letterSpacing: 0,
    textAlign: '',
    color: '',
    backgroundColor: ''
  },
  component: 'de-button',
  options: {
    refId: '1234567890',
    attrs: {
      type: 'primary',
      round: true
    },
    value: '测试按钮'
  }
}

class ButtonSureServiceImpl extends WidgetService {
  constructor(options) {
    Object.assign(options, defaultOptions)
    super(options)
  }

  initWidget() {
    // console.log('this is first initWidget')
  }
  toDrawWidget() {
    // console.log('this is first toDrawWidget')
  }
  // 移动到画布之前回掉
  beforeToDraw() {

  }
}
const buttonSureServiceImpl = new ButtonSureServiceImpl({ name: 'buttonSureWidget' })
export default buttonSureServiceImpl